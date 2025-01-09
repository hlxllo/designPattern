package com.hlxllo.decorator;

/**
 * @author hlxllo
 * @description 培根(具体的装饰者)
 * @date 2025/1/9
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    // 计算价格
    @Override
    public float getPrice() {
        return super.getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
