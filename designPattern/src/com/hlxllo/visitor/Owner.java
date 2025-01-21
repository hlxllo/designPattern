package com.hlxllo.visitor;

/**
 * @author hlxllo
 * @description 具体访问者
 * @date 2025/1/21
 */
public class Owner implements Person {
    @Override
    public void feed(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("主人喂猫");
        } else if (animal instanceof Dog) {
            System.out.println("主人喂狗");
        }
    }
}
