package com.topic2.build;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {A, B, C, D}
    final Set<Topping> toppings;

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    /*
    * 递归类型参数: java 没有self，为了子类能返回正确的类型【即类型为Build的子类】
    * */
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();
        protected abstract T self();
    }
}


/*
* 继承抽象类必须实现抽象方法
* */
class Ext extends Pizza.Builder {
    @Override
    Pizza build() {
        return null;
    }

    @Override
    protected Pizza.Builder self() {
        return null;
    }

}


