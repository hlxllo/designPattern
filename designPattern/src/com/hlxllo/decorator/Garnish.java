package com.hlxllo.decorator;

/**
 * @author hlxllo
 * @description 装饰者类
 * @date 2025/1/9
 */
public abstract class Garnish extends FastFood{

    private final FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
