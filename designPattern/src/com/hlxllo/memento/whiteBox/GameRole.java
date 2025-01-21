package com.hlxllo.memento.whiteBox;

/**
 * @author hlxllo
 * @description 游戏角色类
 * @date 2025/1/21
 */
public class GameRole {
    private int hp;
    private int atk;
    private int def;

    // 初始化状态
    public void initState() {
        hp = 100;
        atk = 100;
        def = 100;
    }

    // 战斗
    public void fight() {
        hp = 0;
        atk = 0;
        def = 0;
    }

    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(hp, atk, def);
    }

    // 恢复角色状态
    public void recoverState(RoleStateMemento memento) {
        hp = memento.getHp();
        atk = memento.getAtk();
        def = memento.getDef();
    }

    // 展示角色状态
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("角色当前 hp：" + hp);
        System.out.println("角色当前 attack：" + atk);
        System.out.println("角色当前 defense：" + def);
    }

}
