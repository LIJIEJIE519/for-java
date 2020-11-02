package com.topic3.equals;

import java.util.Objects;

public class Point {
    /*
    * 传递性测试，使用组合
    * */

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // 原生态 getclass()--测试equals()
        // 使用继承时，未考虑新增组件
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    static class A extends Point {
        private final int c;

        public A(int x, int y, int c) {
            super(x, y);
            this.c = c;
        }
    }

    public static void main(String[] args) {
        A a = new A(1, 2, 3);
        A b = new A(1, 2, 4);
        System.out.println(a.equals(b));  // 原生态 getclass() true
    }
}
