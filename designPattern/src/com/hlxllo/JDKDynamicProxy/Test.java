package com.hlxllo.JDKDynamicProxy;

public class Test {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxy = factory.getProxy();
        proxy.buy();
    }
}
