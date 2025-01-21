package com.hlxllo.visitor;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/21
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        Person person = new Owner();
        home.add(new Cat());
        home.add(new Dog());
        home.action(person);
    }
}
