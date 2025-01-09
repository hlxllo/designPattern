package com.hlxllo.builder;

/**
 * @author dogofayaka
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    // 构建自行车
    public abstract Bike buildBike();
}
