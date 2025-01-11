package com.hlxllo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hlxllo
 * @description 服务员类(请求者，持有多个任务)
 * @date 2025/1/11
 */
public class Waiter {

    private final List<Command> commands = new ArrayList<>();
    public void setCommand(Command command) {
        commands.add(command);
    }

    // 发起命令
    public void order() {
        System.out.println("订单来咯");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
        commands.clear();
    }
}
