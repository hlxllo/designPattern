package com.hlxllo.command;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/11
 */
public class Client {
    public static void main(String[] args) {
        // 创建订单
        Order o1 = new Order();
        o1.setDiningNumber(1);
        o1.setOrder("番茄炒蛋", 1);
        o1.setOrder("小杯可乐", 1);
        Order o2 = new Order();
        o2.setDiningNumber(2);
        o2.setOrder("青椒肉丝面", 2);
        o2.setOrder("大杯雪碧", 2);
        // 创建厨师
        Chief chief = new Chief();
        // 创建订单命令
        OrderCommand c1 = new OrderCommand(chief, o1);
        OrderCommand c2 = new OrderCommand(chief, o2);
        // 下订单
        Waiter waiter = new Waiter();
        waiter.setCommand(c1);
        waiter.setCommand(c2);
        waiter.order();
    }
}
