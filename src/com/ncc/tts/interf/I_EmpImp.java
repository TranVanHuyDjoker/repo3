package com.ncc.tts.interf;

public class I_EmpImp implements I_Employ {

    @Override
    public void luong() {
        System.out.println("luonf here");
    }

    public static void main(String[] args) {
        I_EmpImp e1= new I_EmpImp();
        I_Employ e2= new I_EmpImp();
        I_Person e3 = new I_EmpImp();

        e1.luong();
        e2.luong();
        e3.luong();
    }
}
