package com.topic3.equals;

import java.util.Comparator;

/**
 * @Author LJ
 * @Date 2020/11/13
 * msg
 */

public class B extends Point {
    private final int c;

    public B(int x, int y, int c) {
        super(x, y);
        this.c = c;
    }

    public static void main(String[] args) {
        B a = new B(1, 2, 3);
        B b = new B(1, 2, 4);
        System.out.println(a.equals(b));  // 原生态 getclass() true
    }
}