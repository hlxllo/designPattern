package com.hlxllo.command;

import java.util.HashMap;

/**
 * @author hlxllo
 * @description 订单类
 * @date 2025/1/11
 */
public class Order {
    // 订单号码
    private int diningNumber;
    // 餐品名称和数量
    private final HashMap<String, Integer> orders = new HashMap<>();

    public int getDiningNumber() {
        return diningNumber;
    }

    public void setDiningNumber(int diningNumber) {
        this.diningNumber = diningNumber;
    }

    public HashMap<String, Integer> getOrders() {
        return orders;
    }

    public void setOrder(String name, int number) {
        orders.put(name, number);
    }
}
