package com.hlxllo.objectAdapter;

/**
 * @author dogofayaka
 */
public class Client {
    public static void main(String[] args) {
        Reader reader = new Reader();
        String s1 = reader.readSD(new SDCardImpl());
        System.out.println("s1 = " + s1);
        TFCard tfCard = new TFCardImpl2();
        String s2 = reader.readSD(new SDAdaptTF(tfCard));
        System.out.println("s2 = " + s2);
    }
}
