package com.ncc.tts.tc;

public class ex2 {

    public static void vali(int a){
        if(a<18)
            throw new ArithmeticException("loi");
        else
            System.out.println("chao");
    }
    public static void main(String[] args) {
        vali(13);
        System.out.println("ok");
    }
}
