package com.ncc.tts.pool;

public class A {
    public static void main(String[] args) {
        String a1 = "chao";
        String a2 = "chao";
        String a3 = new String("chao");

        System.out.println(a1==a2);
        System.out.println(a1==a3);
        System.out.println(a1.equals(a3));

    }
}
