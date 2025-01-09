package com.hlxllo.objectAdapter;


/**
 * @author dogofayaka
 * @description: 对象适配器，可拆卸
 */
public class SDAdaptTF implements SDCard {

    // 声明适配者对象
    private TFCard tfCard;

    public SDAdaptTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
