package com.topic2.singleton;

public enum  Singleton_enum {
    /*
     * 基于枚举类型创建单例模式
     * */
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}