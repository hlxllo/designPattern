package com.hlxllo.visitor;

/**
 * @author hlxllo
 * @description 具体访问者
 * @date 2025/1/21
 */
public class Someone implements Person {
    @Override
    public void feed(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("其他人喂猫");
        } else if (animal instanceof Dog) {
            System.out.println("其他人喂狗");
        }
    }
}
