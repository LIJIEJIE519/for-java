package com.xjj.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author LJ
 * @Date 2020/11/12
 * msg
 */

@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}
