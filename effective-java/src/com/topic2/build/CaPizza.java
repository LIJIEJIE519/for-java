package com.topic2.build;

public class CaPizza extends Pizza {
    /* 需要酱汁与否 */
    private final boolean sauceInside;

    // 构造方法
    private CaPizza(BuilderA builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public static class BuilderA extends Pizza.Builder<BuilderA> {
        private boolean sauceInside = false;

        public BuilderA sauceInside() {
            sauceInside = true;
            return  this;
        }

        // 构造器
        @Override
        CaPizza build() {
            return new CaPizza(this);
        }

        @Override
        protected BuilderA self() {
            return this;
        }
    }
}
