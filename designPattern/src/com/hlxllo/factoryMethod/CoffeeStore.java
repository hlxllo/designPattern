package com.hlxllo.factoryMethod;

/**
 * @author dogofayaka
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        return factory.createCoffee();
    }
}
