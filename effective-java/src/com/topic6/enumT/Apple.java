package com.topic6.enumT;

/**
 * @Author LJ
 * @Date 2020/11/19
 * msg
 */

public enum Apple {
    FUJI, PIPP;
    // final private
    private final String string = "21";
    // 构造器 默认且只能为private
    private Apple(){}
    private Apple(String a) {}
}