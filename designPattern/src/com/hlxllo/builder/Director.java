package com.hlxllo.builder;

/**
 * @author dogofayaka
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.buildBike();
    }
}
