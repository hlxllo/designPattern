package com.hlxllo.builderExtension;

/**
 * @author dogofayaka
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("AMD")
                .screen("IPS")
                .memory("8GB")
                .mainBoard("ROG")
                .build();
        System.out.println(phone);
    }
}
