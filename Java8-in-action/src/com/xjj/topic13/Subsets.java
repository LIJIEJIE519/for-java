package com.xjj.topic13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author LJ
 * @Date 2020/11/11
 * msg
 */

public class Subsets {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 9);
//        System.out.println(list.subList(1, list.size()));
    }


    public static List<List<Integer>> subsets(List<Integer> list) {
        // 如果为空集，其子集为空
        if (list.isEmpty()) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(Collections.emptyList());
            return ans;
        }

        // 不为空，提取首元素作为第一部分
        Integer first = list.get(0);
        // 剩余部分，作为第二部分
        List<Integer> rest = list.subList(1, list.size());
        // 剩余部分的子集
        final List<List<Integer>> subset1 = subsets(rest);
        // 将第一部分作为子集插入到第二部分到子集
        final List<List<Integer>> subset2 = insertAll(first, subset1);
        // 将两部分子集整合
        return concat(subset1, subset2);

    }

    public static List<List<Integer>> insertAll(Integer first, List<List<Integer>> lists) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> l : lists) {
            List<Integer> copyList = new ArrayList<>();
            copyList.add(first);
            copyList.addAll(l);
            result.add(copyList);
        }
        return result;
    }

    static List<List<Integer>> concat(List<List<Integer>> a, List<List<Integer>> b) {
        List<List<Integer>> r = new ArrayList<>(a);
        r.addAll(b);
        return r;
    }
}
