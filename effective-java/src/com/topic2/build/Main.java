package com.topic2.build;

public class Main {
    public static void main(String[] args) {
        NutritionFacts builder = new NutritionFacts.Builder(100, 1).c(1).e(2).builder();
        System.out.println("Hello");
    }
}
