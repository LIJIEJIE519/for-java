package com.xjj.topic3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author LJ
 * @Date 2020/11/2
 * msg
 */

public class ForEach {
    /*
     * <T>这个T是修饰符的功能，表示该方法为泛型方法，传入参数有泛型，
     * 就像有static修饰的方法是个静态方法一样。
     * */
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T i: list) {
            // 对i 做什么操作
            consumer.accept(i);
        }
    }
    public static void main(String[] args) {
        // 签名一致，泛型T，需要为对象，所以不能为基本类型
        forEach(Arrays.asList(1, 2, 3), (Integer i) -> System.out.println(i));
    }

    public static int test() {
        return 1;
    }
}
