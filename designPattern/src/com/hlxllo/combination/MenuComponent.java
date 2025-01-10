package com.hlxllo.combination;

/**
 * @author hlxllo
 * @description 菜单组件类(抽象根节点)
 * @date 2025/1/10
 */
public abstract class MenuComponent {

    private final String name;

    private final int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持添加子菜单");
    }

    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持移除子菜单");
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException("不支持获取子菜单");
    }

    // 获取菜单或者菜单项的名称
    public String getName() {
        return name;
    }

    // 打印菜单(包含子菜单和菜单项)
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
    }

}
