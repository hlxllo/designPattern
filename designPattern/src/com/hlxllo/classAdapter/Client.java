package com.hlxllo.classAdapter;

/**
 * @author dogofayaka
 */
public class Client {
    public static void main(String[] args) {
        Reader reader = new Reader();
        String s1 = reader.readSD(new SDCardImpl());
        System.out.println("s1 = " + s1);
        String s2 = reader.readSD(new SDAdaptTF());
        System.out.println("s2 = " + s2);
    }
}
