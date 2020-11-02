package com.topic2.weakHashMap;

import java.util.HashMap;

public class HashMapTest {

    /*内存不足的时候，`HashMap`宁可抛出`OutOfMemoryError`异常也不会回收其相应的没有被引用的对象
    * hashmap 是强引用
    */

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        for (int i = 0; ; i++) {
            hashMap.put(i, new String("HashMap"));//一直往里面加数据

            if (i % 1000 == 0) { //每隔一千次判断一下有没有对象被回收
                for (int j = 0; j < i; j++) {//遍历一遍
                    if (hashMap.get(j) == null) {
                        System.out.println("第" + j + "个对象开始回收");
                        return;
                    }
                }
            }
        }
    }
}
