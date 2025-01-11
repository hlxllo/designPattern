package com.hlxllo.flyweight;

import java.util.HashMap;

/**
 * @author hlxllo
 * @description 方块工厂(单例)
 * @date 2025/1/11
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> boxes;

    private BoxFactory() {
        boxes = new HashMap<>();
        boxes.put("I", new IBox());
        boxes.put("L", new LBox());
    }

    private static BoxFactory factory = new BoxFactory();

    public static BoxFactory getInstance() {
        return factory;
    }

    public AbstractBox getShape(String name) {
        return boxes.get(name);
    }
}
