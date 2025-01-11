package com.hlxllo.template;

/**
 * @author hlxllo
 * @description 抽象模版方法和基础方法
 * @date 2025/1/11
 */
public abstract class AbstractClass {

    // 模版方法
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    // 一样，直接实现
    private void pourOil() {
        System.out.println("倒油");
    }

    // 一样，直接实现
    private void heatOil() {
        System.out.println("热油");
    }

    // 倒蔬菜不一样
    protected abstract void pourVegetable();

    // 倒调味料不一样
    protected abstract void pourSauce();

    // 一样，直接实现
    private void fry() {
        System.out.println("翻炒");
    }
}
