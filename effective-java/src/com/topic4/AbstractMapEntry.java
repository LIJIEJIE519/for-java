package com.topic4;

import java.util.Map;
import java.util.Objects;

/**
 * @Author LJ
 * @Date 2020/11/16
 * msg
 */

public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    @Override
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public V setValue(V value) {
        return null;
    }
}
