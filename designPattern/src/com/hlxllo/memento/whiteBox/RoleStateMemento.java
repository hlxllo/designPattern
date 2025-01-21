package com.hlxllo.memento.whiteBox;

/**
 * @author hlxllo
 * @description 备忘录角色类
 * @date 2025/1/21
 */
public class RoleStateMemento {
    private int hp;
    private int atk;
    private int def;

    public RoleStateMemento(int hp, int atk, int def) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

}
