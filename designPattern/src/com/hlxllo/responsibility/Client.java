package com.hlxllo.responsibility;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/11
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("小明", 5, "似了");
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler generalManager = new GeneralManager();
        // 构建责任链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        groupLeader.submit(request);
    }
}
