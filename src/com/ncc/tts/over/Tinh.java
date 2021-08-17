package com.ncc.tts.over;

public class Tinh {
    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a , int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Tinh t= new Tinh();
        t.sum(1,2);
        t.sum(1,2,3);
    }
}
