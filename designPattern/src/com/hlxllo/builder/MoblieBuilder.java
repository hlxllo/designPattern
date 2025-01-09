package com.hlxllo.builder;

/**
 * @author dogofayaka
 */
public class MoblieBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike buildBike() {
        System.out.println("摩拜单车");
        return bike;
    }
}
