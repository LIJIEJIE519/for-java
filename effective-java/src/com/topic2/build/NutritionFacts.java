package com.topic2.build;


/*
* 1. Builder模式
*   1.1 多参数问题
* */
public class NutritionFacts {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    private NutritionFacts(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public static class Builder {
        // 必要参数
        private final int a;
        private final int b;
        // 非必要参数
        private int c = 0;
        private int d = 0;

        public Builder(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public Builder c(int val) {
            c = val; return this;
        }
        public Builder e(int val) {
            d = val; return this;
        }
        public NutritionFacts builder() {
            return new NutritionFacts(this);
        }
    }

    public static void main(String[] args) {
        // 流式API, 模拟具名可选参数
        NutritionFacts nu = new Builder(100, 1).c(1).e(2).builder();
    }
}
