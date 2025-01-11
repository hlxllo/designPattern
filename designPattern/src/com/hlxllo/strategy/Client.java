package com.hlxllo.strategy;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/11
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.show();
        // 换其他的销售策略
        salesMan.setStrategy(new StrategyB());
        salesMan.show();
    }
}
