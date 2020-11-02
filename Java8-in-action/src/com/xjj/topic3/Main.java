package com.xjj.topic3;

import com.xjj.Apple;
import com.xjj.topic2.FilteringApples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

/**
 * @Author star
 * @Date 2020/10/31
 * msg
 */

public class Main {



    public static void main(String[] args) {
        // 目标类型  String必须指定
        Consumer<String> consumer = (String s) -> System.out.println(s.length());
        Consumer<String> consumer1 = s -> System.out.println(s.length());

        List<String> list = new ArrayList<>();

        Predicate<String> pre = s -> list.add(s);
        Consumer<String> con = s-> list.add(s);
        // true
        System.out.println(pre.test("s"));
        // void can not resolve
//        System.out.println(con.accept("123"));

        // () -> void  <> 不用指定
        Runnable runnable = () -> System.out.println("12312");

        Comparator<String> comparator = (a, b) -> a.compareTo(b);

        /*
        * Lambda可以使用局部变量，但是该变量必须是最终的或隐式最终的【不修改】
        * */
        int test = 100;
        Runnable r1 = () -> System.out.println(test);
        // lambda错误
//        test = 1000;

        String s = new String("1213");
        Supplier<Integer> supplier = () -> s.length();
        System.out.println(supplier.get());
//        Supplier<String> supplier2 = () -> s::length;

        /*
        * 方法引用
        * */
        List<String> strs = Arrays.asList("a", "b", "c");
        // 默认实现 int compare(T o1, T o2);
        strs.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        // 方法引用  调用实例方法
        strs.sort(String::compareToIgnoreCase);


        /*
        * 构造函数引用
        * */
        // 1。 无参构造
        Supplier<Apple> c1 = Apple::new;
        Supplier<Apple> c2 = () -> new Apple();
        Apple a1 = c1.get();

        //2.
        Function<Integer, Apple> f1 = Apple::new;
        Function<Integer, Apple> f2 = (weight) -> new Apple(weight);
        Apple a2 = f1.apply(10);

        //3.
        BiFunction<Integer, String, Apple> b3 = Apple::new;
        BiFunction<Integer, String, Apple> b4 = (w, c) -> new Apple(w, c);
        Apple a3 = b3.apply(100, "red");
    }
    
}
