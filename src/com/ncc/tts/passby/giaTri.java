package com.ncc.tts.passby;

public class giaTri {
    int data= 50;

    void change(int data){
        data = data + 5;
    }

    public static void main(String[] args) {
        giaTri g = new giaTri();
        System.out.println("truoc "+ g.data);

        g.change(30);
        System.out.println("sau: "+ g.data);
    }

}
