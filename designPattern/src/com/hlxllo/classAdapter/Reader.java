package com.hlxllo.classAdapter;

/**
 * @author dogofayaka
 * @description: 读取器
 */
public class Reader {
    // 从 sd 卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is null");
        }
        return sdCard.readSD();
    }
}
