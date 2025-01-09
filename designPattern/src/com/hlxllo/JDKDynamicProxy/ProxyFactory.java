package com.hlxllo.JDKDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author dogofayaka
 */
public class ProxyFactory {
    // 目标对象
    private TrainStation t = new TrainStation();

    public SellTickets getProxy() {
        return (SellTickets) Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                (proxy1, method, args) -> {
                    System.out.println("代售点卖票");
                    return method.invoke(t, args);
                }
        );
    }
}
