package com.xjj.topic2;

import java.util.ArrayList;
import java.util.List;

public class FilterT {


    /*过滤器 抽象化【泛型】*/
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e))
                result.add(e);
        }
        return result;
    }

    /*类型 抽象化*/
    public interface Predicate<T> {
        boolean test(T t);
    }
}
