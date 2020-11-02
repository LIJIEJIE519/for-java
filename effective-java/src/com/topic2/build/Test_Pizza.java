package com.topic2.build;

public class Test_Pizza {

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.S)
                .addTopping(Pizza.Topping.A).addTopping(Pizza.Topping.C).build();
        System.out.println(nyPizza.toppings);

        CaPizza caPizza = new CaPizza.BuilderA().addTopping(Pizza.Topping.B).addTopping(Pizza.Topping.D)
                .sauceInside().build();

    }
}
