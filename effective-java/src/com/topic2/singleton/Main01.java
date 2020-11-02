package com.topic2.singleton;

public class Main01 {
    public static void main(String[] args) {
        Singleton_enum instance1 = Singleton_enum.INSTANCE;
        Singleton_enum instance2 = Singleton_enum.INSTANCE;
        System.out.println(instance1 == instance2);
    }

}
