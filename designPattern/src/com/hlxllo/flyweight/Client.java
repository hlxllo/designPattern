package com.hlxllo.flyweight;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/11
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox box = factory.getShape("I");
        box.display("pink");
    }
}
