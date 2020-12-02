package com.topic7;

import java.util.Collections;
import java.util.HashMap;
import java.util.function.*;

/**
 * @Author LJ
 * @Date 2020/11/23
 * msg
 */

public class Main {
    public static void main(String[] args) {

        /*43. 方法引用*/
        final HashMap<String, Integer> map = new HashMap<>();
        // BiFunction<? super V, ? super V, ? extends V>
        map.merge("key", 1, (count, incr) -> count + incr);
        map.merge("key", 1, Integer::sum);
//        System.out.println(map);


    }
}
