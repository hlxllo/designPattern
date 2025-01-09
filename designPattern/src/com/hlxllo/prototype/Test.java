package com.hlxllo.prototype;

/**
 * @author dogofayaka
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        // 克隆对象（浅克隆）
        Citation c2 = c1.clone();
        c1.setName("张三");
        c2.setName("李四");
        c1.show();
        c2.show();
    }
}
