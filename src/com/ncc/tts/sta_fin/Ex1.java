package com.ncc.tts.sta_fin;
// biến
public class Ex1 {
    int id;
    static String college = "Bưu Chính";

    Ex1(int i) {
        id = i;
    }

    void display() {
        System.out.println(id + " - " + college);
    }

    public static void main(String args[]) {
        Ex1 s1 = new Ex1(1);
        Ex1 s2 = new Ex1(23);

        s1.display();
        s2.display();
    }

}
