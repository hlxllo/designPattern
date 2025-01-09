package com.hlxllo.classAdapter;

/**
 * @author dogofayaka
 * @description: 类适配器
 */
public class SDAdaptTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
