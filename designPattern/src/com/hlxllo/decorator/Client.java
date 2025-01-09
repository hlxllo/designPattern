package com.hlxllo.decorator;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/9
 */
public class Client {
    public static void main(String[] args) {
        // 点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food);
        System.out.println(food.getDesc() + ", " + food.cost());
        // 加个鸡蛋
        food = new Egg(food);
        System.out.println(food);
        System.out.println(food.getDesc() + ", " + food.cost());
        // 加个培根
        food = new Bacon(food);
        System.out.println(food);
        System.out.println(food.getDesc() + ", " + food.cost());
    }
}
