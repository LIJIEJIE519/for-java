package com.topic3.equals;

import java.util.Comparator;
import static java.util.Comparator.comparingInt;    // 静态导入 1.5

public class Standard implements Comparable<Standard>{
    private final int code, prefix, line;

    public Standard(int code, int prefix, int line) {
        this.code = code;
        this.prefix = prefix;
        this.line = line;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Standard))
            return false;
        Standard sd = (Standard)o;
        return sd.code == code &&
                sd.line == line &&
                sd.prefix == prefix;
    }

    // 多参数比较静态导入，比较器构造方法
    private static final Comparator<Standard> comparator = comparingInt((Standard sd) -> sd.code)
            .thenComparingInt(pn -> pn.prefix).thenComparingInt(pn -> pn.line);

    @Override
    public int compareTo(Standard sd) {
        return comparator.compare(this, sd);
    }

    public static void main(String[] args) {
        Standard s1 = new Standard(1, 2, 3);
        Standard s2 = new Standard(1, 2, 4);

        System.out.println(s1.compareTo(s2));

    }
}
