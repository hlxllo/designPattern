package com.hlxllo.iterator;

/**
 * @author hlxllo
 * @description 抽象聚合类
 * @date 2025/1/21
 */
public interface Aggregate<T> {
    void add(T t);

    void remove(T t);

    Iterator<T> getIterator();
}
