package com.hlxllo.iterator;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/21
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregate aggregate = new StudentAggregate();
        aggregate.add(new Student("张三", "001"));
        aggregate.add(new Student("李四", "002"));
        aggregate.add(new Student("王五", "003"));
        aggregate.add(new Student("赵六", "004"));
        Iterator<Student> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
