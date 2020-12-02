package com.topic6.enumT;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @Author LJ
 * @Date 2020/11/20
 * msg
 */

public enum Operation {

    /*
    * 常量
    * 构造器连接数据()
    * 覆盖抽象方法
    * */
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {public double apply(double x, double y) {
            return x - y;
        }},
    TIMES("*") {public double apply(double x, double y) {return x * y; }},
    DIVIDE("/") {public double apply(double x, double y) {
            return x / y;
        }};

    private final String symbol;
    /*
    * 特定于常量的数据
    * 构造器
    * */
    Operation(String symbol) {this.symbol = symbol;}

    /*
    * ==特定于常量的方法实现==
    * 定义抽象方法，表示不同行为
    * 每个常量实现覆盖之
    * */
    public abstract double apply(double x, double y);

    @Override
    public String toString() {
        return symbol;
    }

    // Implementing a fromString method on an enum type (Page 164)
    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).collect(
                    toMap(Object::toString, e -> e));

    // 使用定制的symbol获取变成相应的枚举
    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static void main(String[] args) {
        final double apply = Operation.PLUS.apply(1, 2);
        System.out.println(apply);

        final Operation operation = Operation.valueOf("MINUS");
        final double apply1 = operation.apply(1, 2);
        //toString 方法
        System.out.println(Operation.MINUS);

        final Optional<Operation> optional = Operation.fromString("+");
        System.out.println(optional);
    }
}
