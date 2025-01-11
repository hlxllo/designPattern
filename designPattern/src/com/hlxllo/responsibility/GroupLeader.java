package com.hlxllo.responsibility;

/**
 * @author hlxllo
 * @description 组长类
 * @date 2025/1/11
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0, ONE);
    }

    @Override
    protected void handleRequest(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getContent());
        System.out.println("组长审批通过");
    }
}
