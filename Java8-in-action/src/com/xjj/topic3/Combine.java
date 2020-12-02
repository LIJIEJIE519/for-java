package com.xjj.topic3;

import com.xjj.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author LJ
 * @Date 2020/11/3
 * msg
 */

public class Combine {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        /*1. 比较器复合
        * */
        // 逆序排序
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        // 同等重量在排序
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));

        /*2. 谓词复合
        * negate==非
        * and 、or
        * */
        Predicate<Apple> redApple = (a) -> "red".equals(a.getColor());
        // 非红苹果
        Predicate<Apple> negate = redApple.negate();
        Predicate<Apple> and = redApple.and(a -> a.getWeight() > 150);


    }
}
