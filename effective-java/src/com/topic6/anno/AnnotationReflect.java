package com.topic6.anno;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * @Author LJ
 * @Date 2020/11/21
 * msg 注解在反射函数中的使用示例
 */

// 指明保留策略
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    // 定义@MyAnnotation(value={}) 默认值
    String[] value() default "Unknown";
}

class Person {
    /**
     * empty()方法同时被 "@Deprecated" 和 "@MyAnnotation"所标注
     * 1. @Deprecated, 该方法不再被建议使用
     * 2. @MyAnnotation, 该方法对应的MyAnnotation的value值是默认值"unknown"
     */
    @MyAnnotation
    @Deprecated
    public void empty() {
        System.out.println("empty()");
    }

    /**
     * MyAnnotation的value值是{"girl","boy"}
     */
    @MyAnnotation(value = {"girl", "boy"})
    public void somebody(String name, int age) {
        System.out.println("somebody(): " + name + ", " + age);
    }
}


public class AnnotationReflect {
    public static void main(String[] args) throws Exception{
        final Person person = new Person();
        Class<Person> c_p = Person.class;
        // 指明类型以防重载 Method-->package java.lang.reflect;
        Method somebody = c_p.getMethod("somebody", String.class, int.class);
        // 执行该方法, 可变参数
        somebody.invoke(person, new Object[]{"XJJ", 20});
        reflect(somebody);

        System.out.println();
        Method empty = c_p.getMethod("empty", new Class[]{});
        empty.invoke(person, new Object[]{});
        reflect(empty);

    }

    public static void reflect(Method method) {
        // 判断方法是否包含对应注解
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            // 获取该注解实例
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            String[] value = myAnnotation.value();
            System.out.print("MyAnnotation(value): ");
            for (String v : value) {
                System.out.print(v + ", ");
            }
            System.out.println();
        }

        // 获取方法上的所有注解，并打印
        System.out.println("该方法包含注解： ");
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
