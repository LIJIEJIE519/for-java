package com.topic7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author LJ
 * @Date 2020/11/23
 * msg
 */

public class ReduceMerge {
    public static void main(String[] args) {
        // 统计单词数，计算总价钱等
        HashMap<String, Integer> map = new HashMap<>();
        List<String> words = Arrays.asList("a", "a", "b", "b", "b");
        // forEach[Consumer --> void accept(T t);]
        words.forEach(word -> map.merge(word, 1, Integer::sum));
        System.out.println(map);
    }
}
