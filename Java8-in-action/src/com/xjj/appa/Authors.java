package com.xjj.appa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author LJ
 * @Date 2020/11/12
 * msg
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {
    Author[] value();
}
