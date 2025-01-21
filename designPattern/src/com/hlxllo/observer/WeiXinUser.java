package com.hlxllo.observer;

/**
 * @author hlxllo
 * @description 具体的观察者角色类
 * @date 2025/1/21
 */
public class WeiXinUser implements Observer{

    private final String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + ", " + msg);
    }
}
