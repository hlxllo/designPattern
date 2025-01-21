package com.hlxllo.memento.blackBox;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/21
 */
public class Client {
    public static void main(String[] args) {
        GameRole gamer = new GameRole();
        System.out.println("-------------大战boss前-------------");
        gamer.initState();
        gamer.stateDisplay();
        // 存档
        Memento state = gamer.saveState();
        System.out.println("-------------大战boss后-------------");
        // 损失惨重
        gamer.fight();
        gamer.stateDisplay();
        System.out.println("-------------打不过，开G-------------");
        // 恢复存档
        gamer.recoverState(state);
        gamer.stateDisplay();
    }
}
