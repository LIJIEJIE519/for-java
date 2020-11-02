package com.topic2.singleton;

public class Singleton_public {

    /*
     * 基于公有域--公有静态final成员
     * */
    public static final Singleton_public Instance = new Singleton_public();

    private Singleton_public(){}
    public void what() {}

    public static void main(String[] args) {
        Singleton_public instance = Singleton_public.Instance;
    }
}
