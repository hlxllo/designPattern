package com.hlxllo.facade;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/10
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开");
    }
}
