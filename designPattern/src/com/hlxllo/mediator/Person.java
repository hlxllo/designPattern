package com.hlxllo.mediator;

/**
 * @author hlxllo
 * @description 抽象类
 * @date 2025/1/21
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // 和中介联系
    public abstract void contact(String msg);

    // 获取信息
    public abstract void getMessage(String msg);
}
