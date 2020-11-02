package com.topic3.hashcode;

import com.topic3.equals.Standard;

import java.math.BigDecimal;
import java.util.*;

public class StandardTest {

    public static void main(String[] args) {
//        Map<Standard, String> map = new HashMap<>();
//        Standard sd = new Standard(1,2, 3);
//        map.put(sd, "hhh");
//        System.out.println(map.get(sd));

//        Map<String, String> map = new HashMap<>();
//        map.put(new String("aaa"), "123");
//        System.out.println(map.get(new String("aaa"))); //123
//
//        System.out.println(new Standard(1,2, 3));

        BigDecimal bg = new BigDecimal("1.0");
//        BigDecimal bg1 = new BigDecimal("1.00");
        TreeSet set = new TreeSet();
        set.add(bg);
//        set.add(bg1);

        System.out.println(set.contains(new BigDecimal("1.00")));
        System.out.println(set);

    }


}
