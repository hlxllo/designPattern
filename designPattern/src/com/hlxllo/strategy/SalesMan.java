package com.hlxllo.strategy;

/**
 * @author hlxllo
 * @description 销售员(环境类)
 * @date 2025/1/11
 */
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void show() {
        strategy.show();
    }
}
