package com.hlxllo.iterator;

import java.util.List;

/**
 * @author hlxllo
 * @description 具体迭代器类
 * @date 2025/1/21
 */
public class StudentIterator implements Iterator<Student> {

    private final List<Student> list;
    private int position = 0;

    public StudentIterator(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
