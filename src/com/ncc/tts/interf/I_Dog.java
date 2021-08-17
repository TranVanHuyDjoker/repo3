package com.ncc.tts.interf;

public class I_Dog implements I_Animal {
    @Override
    public void them() {
        System.out.println("them---");
    }

    @Override
    public void xoa() {
        System.out.println("xoa ok");
    }


    public static void main(String[] args) {
        I_Dog d = new I_Dog();
        I_Animal a= new I_Dog();

        a.xoa();
        a.them();

        d.xoa();
        d.them();
    }
}
