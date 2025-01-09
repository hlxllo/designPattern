package com.hlxllo.abstractFactory;

/**
 * @author dogofayaka
 * 意大利风味工厂
 */
public class ItalyFactory implements Factory{
    // 生产拿铁咖啡
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    // 生产提拉米苏（意大利风味）
    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
