package com.hlxllo.state;

/**
 * @author hlxllo
 * @description 状态对象
 * @date 2025/1/11
 */
public class ClosingState extends LiftState {

    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关门");
    }

    @Override
    public void run() {
        context.setLiftState(Context.RUNNING_STATE);
        context.run();
    }

    @Override
    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.stop();
    }
}
