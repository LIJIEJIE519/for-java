package com.topic2.build;


import java.util.Objects;

/* 需要尺寸参数 */
public class NyPizza extends Pizza {
    public enum Size {S, M, L}
    private final Size size;

    // 父类无隐式构造方法，需显示调用
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}