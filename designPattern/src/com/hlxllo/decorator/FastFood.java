package com.hlxllo.decorator;

/**
 * @author hlxllo
 * @description 快餐类
 * @date 2025/1/9
 */
public abstract class FastFood {
    // 价格
    private float price;
    // 描述
    private String desc;
    // 获取价格
    public abstract float cost();

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
