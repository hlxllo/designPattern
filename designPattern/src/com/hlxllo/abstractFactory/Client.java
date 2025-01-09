package com.hlxllo.abstractFactory;

/**
 * @author dogofayaka
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ItalyFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        coffee.addSugar();
        coffee.addMilk();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
