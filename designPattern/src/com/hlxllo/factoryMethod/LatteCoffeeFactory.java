package com.hlxllo.factoryMethod;

/**
 * @author dogofayaka
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
