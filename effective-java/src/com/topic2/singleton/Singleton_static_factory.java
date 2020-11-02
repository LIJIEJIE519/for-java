package com.topic2.singleton;

public class Singleton_static_factory {

    /*
    * 基于静态工厂创建单例模式
    * */
    private static final Singleton_static_factory Instance = new Singleton_static_factory();

    private Singleton_static_factory(){}
    public static Singleton_static_factory getInstance() {
        return Instance;
    }

    public static void main(String[] args) {
        Singleton_static_factory instance = Singleton_static_factory.getInstance();
    }
}
