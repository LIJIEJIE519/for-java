package com.topic7;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @Author LJ
 * @Date 2020/11/23
 * msg
 */

public enum Operation {

    /*
     * 常量
     * 构造器连接数据(symbol, 默认实现applyAsDouble)
     * */
    PLUS("+", (x, y) -> x + y) ,
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y) ,
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;
    /*
     * 特定于常量的数据
     * 构造器
     * */
    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }

    public static void main(String[] args) {
        final double apply = Operation.PLUS.apply(1, 2);
        System.out.println(apply);

    }
}

