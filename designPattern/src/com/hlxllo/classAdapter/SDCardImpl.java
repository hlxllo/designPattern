package com.hlxllo.classAdapter;

/**
 * @author dogofayaka
 * @description: 具体的 sd 卡
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "Hello SDCard";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write: " + msg);
    }
}
