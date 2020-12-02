package com.topic7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author LJ
 * @Date 2020/11/23
 * msg
 */

public class SortTest {
    public static void sort(List<String> words) {
        // 匿名类
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        // lambda表达式
        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        // 方法引用
        Collections.sort(words, Comparator.comparingInt(String::length));

        words.sort(Comparator.comparingInt(String::length));
    }
}
