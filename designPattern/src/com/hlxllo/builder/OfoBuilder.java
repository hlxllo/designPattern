package com.hlxllo.builder;

/**
 * @author dogofayaka
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike buildBike() {
        System.out.println("ofo 单车");
        return bike;
    }
}
