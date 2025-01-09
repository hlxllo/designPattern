package com.hlxllo.decorator;

/**
 * @author hlxllo
 * @description 炒饭
 * @date 2025/1/9
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
