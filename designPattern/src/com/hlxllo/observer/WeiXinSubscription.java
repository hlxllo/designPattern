package com.hlxllo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hlxllo
 * @description 具体主题角色类
 * @date 2025/1/21
 */
public class WeiXinSubscription implements Subject{

    private final List<Observer> weiXinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : weiXinUserList) {
            observer.update(msg);
        }
    }
}
