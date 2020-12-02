package com.topic5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author LJ
 * @Date 2020/11/19
 * msg 类型安全的异构容器
 */

public class Favorites {
    // 键不同类型，异构
    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> type, T instance) {
        map.put(Objects.requireNonNull(type), instance);
    }

    public <T> T get(Class<T> type) {
        // return (T) obj;
        return type.cast(map.get(type));
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.put(String.class, "Java");
        f.put(Integer.class, 0xcafebabe);
        f.put(Class.class, Favorites.class);
        String favoriteString = f.get(String.class);
        int favoriteInteger = f.get(Integer.class);
        Class<?> favoriteClass = f.get(Class.class);
        System.out.printf("%s %x %s%n", favoriteString,
                favoriteInteger, favoriteClass.getName());
    }
}
