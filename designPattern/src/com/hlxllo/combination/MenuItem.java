package com.hlxllo.combination;

/**
 * @author hlxllo
 * @description 菜单项类(叶子节点)
 * @date 2025/1/10
 */
public class MenuItem extends MenuComponent {

    // 菜单项不能添加或移除子菜单或子菜单项
    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getName());
    }
}
