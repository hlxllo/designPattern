package com.hlxllo.template;

/**
 * @author hlxllo
 * @description 炒卷心菜
 * @date 2025/1/11
 */
public class Cabbage extends AbstractClass{
    @Override
    protected void pourVegetable() {
        System.out.println("卷心菜");
    }

    @Override
    protected void pourSauce() {
        System.out.println("辣椒");
    }
}
