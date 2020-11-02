package com.topic3.equals;

import java.util.Objects;

public class ColorPoint {
    /* 使用组合来代替继承：既增加新的值组件，同时又保留equals的约定 */
    // 私有域 实现组合
    private final Point point;
    private final int c;

    public ColorPoint(int x, int y, int c) {
        // 组合
        point = new Point(x, y);
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        // 如果 o 为ColorPoint的超类，直接false，因为未考虑新加入的组件，肯定不相等
        if (!(o instanceof ColorPoint))
            return false;
        ColorPoint that = (ColorPoint) o;
        return c == that.c &&
                Objects.equals(point, that.point);
    }

    public static void main(String[] args) {
        ColorPoint a = new ColorPoint(1,2, 3);
        ColorPoint b = new ColorPoint(1, 2, 4);

        System.out.println(a.equals(b));  // false
    }
}
