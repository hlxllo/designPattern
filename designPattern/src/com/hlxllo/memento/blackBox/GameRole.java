package com.hlxllo.memento.blackBox;

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
    public Memento saveState() {
        return new RoleStateMemento(hp, atk, def);
    }

    // 恢复角色状态
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        hp = roleStateMemento.getHp();
        atk = roleStateMemento.getAtk();
        def = roleStateMemento.getDef();
    }

    // 展示角色状态
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("角色当前 hp：" + hp);
        System.out.println("角色当前 attack：" + atk);
        System.out.println("角色当前 defense：" + def);
    }

    private static class RoleStateMemento implements Memento {
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
}
