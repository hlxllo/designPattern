package com.hlxllo.iterator;

/**
 * @author hlxllo
 * @description 抽象迭代器接口
 * @date 2025/1/21
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
