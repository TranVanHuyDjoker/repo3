package com.ncc.tts.sta_fin;

public class Bien {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    Bien(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        Bien s1 = new Bien(11, "Thông");
        Bien s2 = new Bien(22, "Minh");

        s1.display();
        s2.display();
    }
}
