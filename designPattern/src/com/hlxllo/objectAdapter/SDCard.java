package com.hlxllo.objectAdapter;

/**
 * @author dogofayaka
 * @description: 目标接口
 */
public interface SDCard {
    // 读取数据
    String readSD();
    // 写入数据
    void writeSD(String msg);
}
