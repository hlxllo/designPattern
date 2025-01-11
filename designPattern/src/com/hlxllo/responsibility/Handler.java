package com.hlxllo.responsibility;

/**
 * @author hlxllo
 * @description 抽象处理者类
 * @date 2025/1/11
 */
public abstract class Handler {
    protected final static int ONE = 1;
    protected final static int THREE = 3;
    protected final static int SEVEN = 7;

    // 领导处理的天数区间
    private int start;
    private int end;

    // 声明后续者
    private Handler nextHandler;

    public Handler(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理请求
    protected abstract void handleRequest(LeaveRequest request);

    // 提交请求
    protected final void submit(LeaveRequest request) {
        handleRequest(request);
        if (nextHandler != null && request.getNum() > end) {
            // 提交给上级领导审批
            nextHandler.submit(request);
        } else {
            System.out.println("审批结束");
        }
    }
}
