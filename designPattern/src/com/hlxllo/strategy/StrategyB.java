package com.hlxllo.strategy;

/**
 * @author hlxllo
 * @description 策略 B
 * @date 2025/1/11
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
