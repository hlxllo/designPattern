package com.hlxllo.classAdapter;

/**
 * @author dogofayaka
 * @description: 适配者类(不能直接用，需要做适配的类)
 */
public interface TFCard {
    // 读取数据
    String readTF();
    // 写入数据
    void writeTF(String msg);
}
