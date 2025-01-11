package com.hlxllo.responsibility;

/**
 * @author hlxllo
 * @description 部门经理类
 * @date 2025/1/11
 */
public class Manager extends Handler{

    public Manager() {
        super(ONE, THREE);
    }

    @Override
    protected void handleRequest(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getContent());
        System.out.println("部门经理审批通过");
    }
}
