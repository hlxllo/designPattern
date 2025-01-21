package com.hlxllo.mediator;

/**
 * @author hlxllo
 * @description 具体的租房者类
 * @date 2025/1/21
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介联系
    @Override
    public void contact(String msg) {
        mediator.contact(msg, this);
    }

    // 获取信息
    @Override
    public void getMessage(String msg) {
        System.out.println("租房者" + name + "获得信息：" + msg);
    }
}
