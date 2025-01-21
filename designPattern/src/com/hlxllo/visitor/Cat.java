package com.hlxllo.visitor;

/**
 * @author hlxllo
 * @description 具体被访问角色
 * @date 2025/1/21
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("喵喵喵");
    }
}
