package com.topic3.equals;

import java.util.Objects;

public class Symmetry {

    /*
    * equals() 对称性测试
    * */
    private final String s;

    public Symmetry(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(o.getClass() + " instanceof Symmetry ：" + (o instanceof Symmetry));
        // 是否是Symmetry的子类实例 && 将Object 强转为Symmetry
        return o instanceof Symmetry &&
                ((Symmetry) o).s.equalsIgnoreCase(s);

        /* 单面true
        * return o instanceof String &&
                s.equalsIgnoreCase((String) o);
        * */
    }

    public static void main(String[] args) {
        Symmetry symmetry = new Symmetry("Hello");
        Symmetry hello = new Symmetry("hello");
        String s = "hello";

        System.out.println(symmetry.equals(s));     // false  注意留意返回true
        System.out.println(s.equals(symmetry));     // false
        System.out.println(symmetry.equals(hello)); // true
        System.out.println(hello.equals(symmetry)); // true
    }

}
