package com.hlxllo.template;

/**
 * @author hlxllo
 * @description 炒空心菜
 * @date 2025/1/11
 */
public class WaterSpinach extends AbstractClass{
    @Override
    protected void pourVegetable() {
        System.out.println("空心菜");
    }

    @Override
    protected void pourSauce() {
        System.out.println("蒜");
    }
}
