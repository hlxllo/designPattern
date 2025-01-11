package com.hlxllo.state;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/11
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 设置当前电梯状态
        context.setLiftState(new RunningState());

        context.stop();
        context.run();
        context.close();
        context.open();
    }
}
