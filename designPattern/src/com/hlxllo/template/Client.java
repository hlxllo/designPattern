package com.hlxllo.template;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/11
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass dish = new WaterSpinach();
        dish.cookProcess();
    }
}
