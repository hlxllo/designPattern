package com.hlxllo.factoryMethod;

/**
 * @author dogofayaka
 */
public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new LatteCoffeeFactory();
        CoffeeStore store = new CoffeeStore(factory);
        Coffee coffee = store.orderCoffee();
        coffee.addSugar();
        coffee.addMilk();
        System.out.println(coffee.getName());
    }
}
