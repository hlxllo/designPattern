package com.hlxllo.objectAdapter;

/**
 * @author dogofayaka
 * @description: 适配者类(不能直接用，需要做适配的类)
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "Hello TFCard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write: " + msg);
    }
}
