package com.hlxllo.state;

/**
 * @author hlxllo
 * @description 状态对象
 * @date 2025/1/11
 */
public class StoppingState extends LiftState {

    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.open();
    }

    @Override
    public void close() {
        context.setLiftState(Context.CLOSING_STATE);
        context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
