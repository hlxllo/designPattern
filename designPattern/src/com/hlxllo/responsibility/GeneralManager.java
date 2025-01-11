package com.hlxllo.responsibility;

/**
 * @author hlxllo
 * @description 总经理类
 * @date 2025/1/11
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(THREE, SEVEN);
    }

    @Override
    protected void handleRequest(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getContent());
        System.out.println("总经理审批通过");
    }
}
