package com.hlxllo.state;

/**
 * @author hlxllo
 * @description 抽象状态类
 * @date 2025/1/11
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
