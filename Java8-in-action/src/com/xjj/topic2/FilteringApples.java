package com.xjj.topic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilteringApples {


    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        List<Apple> filter = filter(inventory, new AppleGreen());

        /*匿名类*/
        List<Apple> redApple = filter(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple a) {
                return "red".equals(a.getColor());
            }
        });

        /*匿名类 排序，List.sort()*/
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });


        /*lambda*/
        List<Apple> apples = filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));

        inventory.sort((Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor()));

    }

    /*行为参数化--过滤器(类，抽象化类)
    * 1. 参数化过滤器：过滤器的行为根据参数而定；
    * 2. 传入具体实现类
    * 3. filter的【行为取决于】ApplePredicate传递的代码
    * */
    public static List<Apple> filter(List<Apple> apples, ApplePredicate ap) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            // 调用真正的实现
            if (ap.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
    * 嵌套接口
    * 1. 一类判断抽象化【**谓词**】
    * 2. 唯一方法返回boolean
    * */
    interface ApplePredicate {
        boolean test(Apple a);
    }

    /*不同实现代表不一样标准，筛选*/
    static class AppleWeight implements ApplePredicate {
        @Override
        public boolean test(Apple a) {
            return a.getWeight() > 150;
        }
    }
    static class AppleGreen implements ApplePredicate {
        @Override
        public boolean test(Apple a) {
            return "green".equals(a.getColor());
        }
    }

    /*
    * 苹果实体类
    * */
    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
