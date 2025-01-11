package com.hlxllo.state;

/**
 * @author hlxllo
 * @description 状态对象
 * @date 2025/1/11
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯开启");
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

    }
}
