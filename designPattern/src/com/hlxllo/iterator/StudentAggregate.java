package com.hlxllo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hlxllo
 * @description 具体聚合类
 * @date 2025/1/21
 */
public class StudentAggregate implements Aggregate<Student> {

    private final List<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public Iterator<Student> getIterator() {
        return new StudentIterator(list);
    }

}
