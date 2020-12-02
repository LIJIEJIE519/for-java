package com.topic4;

import java.util.*;

/**
 * @Author LJ
 * @Date 2020/11/16
 * msg
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1, 2, 3));
        list.removeIf((Integer i) -> i % 2 == 0);
        System.out.println(list);

        final HashMap<Object, Object> map = new HashMap<>();
    }
}
