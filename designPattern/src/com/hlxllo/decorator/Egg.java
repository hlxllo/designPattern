package com.hlxllo.decorator;

/**
 * @author hlxllo
 * @description 鸡蛋(具体的装饰者)
 * @date 2025/1/9
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    // 计算价格
    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
