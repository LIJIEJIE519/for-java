package com.topic5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

/**
 * @Author LJ
 * @Date 2020/11/18
 * msg
 */

public class StackTest<E> {
    private E[] elements;
    private int size = 0;

    public StackTest(){}

    public void push(E e) {}

    public E pop() {
        if (size==0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * E 的某个子类型的Iterable接口
     * @param src
     */
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    /**
     * E 的某个超类的集合
     * @param dst
     */
    public void popAll(Collection<? super E> dst) {
        while (isEmpty()) {
            dst.add(pop());
        }
    }

    public static void main(String[] args) {
        StackTest<Number> test = new StackTest<>();
        // Integer extends Number
        Iterable<Integer> integers = Arrays.asList(1, 2, 3);
        Iterable<Double> dIterable = Arrays.asList(1.0, 2.0, 3.0);
        test.pushAll(integers);
        test.pushAll(dIterable);


        // Object E的超类
        Collection<Object> objects = new ArrayList<>();
        test.popAll(objects);



    }
}
