package com.hlxllo.observer;

/**
 * @author hlxllo
 * @description 抽象主题角色类
 * @date 2025/1/21
 */
public interface Subject {
    // 添加订阅者
    void attach(Observer observer);
    // 删除订阅者
    void detach(Observer observer);
    // 通知订阅者
    void notify(String msg);
}
