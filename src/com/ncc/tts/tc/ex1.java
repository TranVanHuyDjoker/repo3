package com.ncc.tts.tc;

public class ex1 {
    public static void main(String[] args) {
        try {
            int z = 0;
            int a = 10 / z;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally thực thi");
        }
        System.out.println("oko");

    }
}
