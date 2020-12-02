package com.xjj.topic10;

import java.util.Optional;

/**
 * @Author LJ
 * @Date 2020/11/9
 * msg
 */

public class OptionalUtils {

    public static Optional<Integer> strToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
