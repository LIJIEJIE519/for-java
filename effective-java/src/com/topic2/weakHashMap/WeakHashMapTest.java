package com.topic2.weakHashMap;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    public static void main(String[] args) {
        WeakHashMap hashMap = new WeakHashMap();
        for (int i = 0; ; i++) {
            hashMap.put(i, new String("WeakHashMap"));//一直往里面加数据

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


    /*
    * WeakHashMap通过将一些没有被引用的键的值赋值为null，这样的话就会告知GC去回收这些存储的值了。
    * */
    public void test() {
        WeakHashMap weakHashMap = new WeakHashMap();
        HashMap hashMap=new HashMap();
        for (int i = 0; ; i++) {

            Integer num=new Integer(i);
            hashMap.put(i,num);
            // num 作为hashmap值被引用
            weakHashMap.put(num, new String("WeakHashMap"));//将num改为i就会有对象被回收

            if (i % 1000 == 0) { //每隔一千次判断一下有没有对象被回收
                for (int j = 0; j < i; j++) {//遍历一遍
                    if (weakHashMap.get(j) == null) {
                        System.out.println("第" + j + "个对象开始回收");
                        return;
                    }
                }
            }
        }
    }
}
