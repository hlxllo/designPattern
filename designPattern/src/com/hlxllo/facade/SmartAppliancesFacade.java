package com.hlxllo.facade;

/**
 * @author hlxllo
 * @description 外观类
 * @date 2025/1/10
 */
public class SmartAppliancesFacade {
    private final Light light;
    private final TV tv;
    private final AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String msg) {
        if ("打开".equals(msg)) {
            on();
        } else if ("关闭".equals(msg)) {
            off();
        } else {
            System.out.println("听不懂捏~");
        }
    }

    public void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    public void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
