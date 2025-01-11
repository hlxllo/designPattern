package com.hlxllo.strategy;

/**
 * @author hlxllo
 * @description 策略 A
 * @date 2025/1/11
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
