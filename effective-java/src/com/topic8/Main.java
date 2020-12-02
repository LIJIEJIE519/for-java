package com.topic8;

import java.util.Objects;

/**
 * @Author LJ
 * @Date 2020/11/24
 * msg
 */

public class Main {
    public static void main(String[] args) {
        String a = "adsa";

        /*
        * 如果失败，抛出AssertionError
        * 本质上没有成本开销
        * */
        assert a != null;
    }
}
