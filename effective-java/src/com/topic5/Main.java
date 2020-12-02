package com.topic5;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * @Author LJ
 * @Date 2020/11/17
 * msg
 */

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("String");
        System.out.println(list.get(0));

    }


    public void t_28() {
        //数组协变的  Long 是Object的子类型
        Object[] obj = new Long[1];
        // 运行时才报错
        obj[0] = "12213";

        //列表【泛型】可变的, 编译不通过
//        List<Object> longs = new ArrayList<Long>();
//        List<String>[] a = new ArrayList<>[1];
    }

    /**
     * 泛型方法
     * <E> 在返回类型前面，代表输入参数带有泛型
     */
    public static <E> List<E> test(E[] a, List<E> list) {
        return list;
    }
}
