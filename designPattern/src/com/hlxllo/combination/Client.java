package com.hlxllo.combination;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/10
 */
public class Client {
    public static void main(String[] args) {
        // 创建菜单树
        MenuComponent m1 = new Menu("菜单管理", 2);
        m1.add(new MenuItem("页面访问", 3));
        m1.add(new MenuItem("展开菜单", 3));
        m1.add(new MenuItem("编辑菜单", 3));
        m1.add(new MenuItem("删除菜单", 3));
        m1.add(new MenuItem("新增菜单", 3));
        MenuComponent m2 = new Menu("权限管理", 2);
        m2.add(new MenuItem("页面访问", 3));
        m2.add(new MenuItem("提交保存", 3));
        MenuComponent m3 = new Menu("角色管理", 2);
        m3.add(new MenuItem("新增角色", 3));
        m3.add(new MenuItem("修改角色", 3));

        // 创建主菜单
        MenuComponent menu = new Menu("系统管理", 1);
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);

        // 打印主菜单
        menu.print();
    }
}
