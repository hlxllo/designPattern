package com.hlxllo.abstractFactory;

/**
 * @author dogofayaka
 */
public interface Factory {

    // 生产咖啡
    Coffee createCoffee();

    // 生产甜品
    Dessert createDessert();
}
