package com.hlxllo.state;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/11
 */
public class Context {
    // 定义对应状态对象的常量
    public final static LiftState OPENING_STATE = new OpeningState();
    public final static LiftState CLOSING_STATE = new ClosingState();
    public final static LiftState RUNNING_STATE = new RunningState();
    public final static LiftState STOPPING_STATE = new StoppingState();

    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 设置当前状态对象中的 context对象
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
