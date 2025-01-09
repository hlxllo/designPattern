package com.hlxllo.JDKDynamicProxy;

/**
 * @author dogofayaka
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }

    @Override
    public void buy() {
        System.out.println("火车站买票");
    }
}
