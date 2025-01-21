package com.hlxllo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hlxllo
 * @description 对象结构类
 * @date 2025/1/21
 */
public class Home {

    private final List<Animal> list = new ArrayList<>();

    public void add(Animal animal) {
        list.add(animal);
    }

    public void action(Person person) {
        for (Animal animal : list) {
            animal.accept(person);
        }
    }
}
