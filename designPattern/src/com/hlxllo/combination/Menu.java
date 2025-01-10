package com.hlxllo.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hlxllo
 * @description 菜单类(树枝节点)
 * @date 2025/1/10
 */
public class Menu extends MenuComponent{

    // 菜单可以有多个子菜单和子菜单项
    private final List<MenuComponent> components = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getName());
        for (MenuComponent component : components) {
            component.print();
        }
    }
}
