package com.xjj.topic3;

import com.xjj.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @Author LJ
 * @Date 2020/11/3
 * msg
 */

public class Compare {


    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));


        /*
        * sort(Comparator<? super E> c)
        * */

        /*1. 原始比较
        * 定义实现接口Comparator
        * */
        inventory.sort(new AppleComparator());

        /*2. 匿名内部类*/
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        /*3. Lambda表达式
        *  类型推断List<Apple>
        * */
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

        /*4. Comparator.comparing 静态辅助方法
        *    public static <T, U> Comparator<T> comparing(
                Function<T, U> keyExtractor)
        * 默认实现apply()方法
        * 底层实现为 3. Lambda表达式
        * */
        Function<Apple, Integer> f = (a) -> a.getWeight();
        inventory.sort(Comparator.comparing(f));

        inventory.sort(Comparator.comparing((a) -> a.getWeight()));

        /*5. 方法引用--指向实例方法的引用*/
        inventory.sort(Comparator.comparing(Apple::getWeight));

    }

    public static class AppleComparator implements Comparator<Apple> {
        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.getWeight().compareTo(o2.getWeight());
        }
    }

}
