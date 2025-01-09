package com.hlxllo.objectAdapter;

/**
 * @author dogofayaka
 * @description: TF 卡的另一种实现
 */
public class TFCardImpl2 implements TFCard{
    @Override
    public String readTF() {
        return "Hello TFCard 2";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard 2 write: " + msg);
    }
}
