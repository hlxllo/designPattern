package com.hlxllo.observer;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/21
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new WeiXinSubscription();
        subject.attach(new WeiXinUser("hlxllo"));
        subject.attach(new WeiXinUser("阿巴巴"));
        subject.notify("微信订阅更新了");
    }
}
