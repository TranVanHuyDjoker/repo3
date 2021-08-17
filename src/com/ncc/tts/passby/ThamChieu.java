package com.ncc.tts.passby;

public class ThamChieu {
    int data = 50;
    void change( ThamChieu t){
        t= new ThamChieu();
        t.data = t.data + 5;
    }

    public static void main(String[] args) {
        ThamChieu tc = new ThamChieu();
        System.out.println("truoc : "+ tc.data);

        tc.change(tc);
        System.out.println("sau: "+ tc.data);
    }
}
