package com.xjj.topic4;

import com.xjj.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author LJ
 * @Date 2020/11/5
 * msg
 */

public class StreamBase {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        inventory.stream()
                .filter(apple -> apple.getWeight() > 100)
                .map(Apple::getColor)   // apply方法
                .limit(3)
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("12345", "123123");
        String s = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .findAny().orElse("");

        /* 规约 */
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        Integer reduce = nums.stream().reduce(1, (a, b) -> a * b);
        // 看reduce需要的参数是谁，Integer::sum就默认实现谁
        nums.stream().reduce(1, Integer::sum);

        /*数值流*/
        inventory.stream().mapToInt(Apple::getWeight).sum();
    }
}
