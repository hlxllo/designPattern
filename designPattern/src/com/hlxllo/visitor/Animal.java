package com.hlxllo.visitor;

/**
 * @author hlxllo
 * @description 抽象被访问角色
 * @date 2025/1/21
 */
public interface Animal {
    // 接受访问者访问的功能
    void accept(Person person);
}
