package com.hlxllo.command;

import java.util.HashMap;

/**
 * @author hlxllo
 * @description 具体命令类(让厨师去做菜)
 * @date 2025/1/11
 */
public class OrderCommand implements Command {

    private final Chief chief;

    private final Order order;

    public OrderCommand(Chief chief, Order order) {
        this.chief = chief;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningNumber() + "桌的订单");
        HashMap<String, Integer> orders = order.getOrders();
        orders.forEach(chief::makeFood);
        System.out.println(order.getDiningNumber() + "桌的订单准备完毕！");
    }
}
