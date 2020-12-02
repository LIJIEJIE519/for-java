package com.topic5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author LJ
 * @Date 2020/11/18
 * msg
 */

public class Gene<E> {
    private E element;


    /*
    * <E> : 类型参数列表
    * Set<E> : 返回类型
    * 先参数列表，在返回类型
    * */
    public static <E> Set<E> union(Set<E> a, Set<E> b) {
        Set<E> result = new HashSet<>(b);
        result.addAll(a);
        return result;
    }
}
