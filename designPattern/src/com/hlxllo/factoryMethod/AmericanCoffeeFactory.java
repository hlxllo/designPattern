package com.hlxllo.factoryMethod;

/**
 * @author dogofayaka
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
