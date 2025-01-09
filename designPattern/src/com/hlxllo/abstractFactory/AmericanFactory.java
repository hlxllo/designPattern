package com.hlxllo.abstractFactory;

/**
 * @author dogofayaka
 * 美式风味工厂
 */
public class AmericanFactory implements Factory{
    // 生产美式咖啡
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    // 生产抹茶慕斯（美式风味）
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
