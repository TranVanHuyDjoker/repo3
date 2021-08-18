package com.ncc.tts.sta_fin;
// Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)

public class Ex2 {
    int id;
    static String college = "Bưu Chính";

    static void change(){
        college="PTIT";
    }
    Ex2(int i) {
        id = i;
    }

    void display() {
        System.out.println(id + " - " + college);
    }

    public static void main(String args[]) {
        Ex2 s1 = new Ex2(1);
        Ex2 s2 = new Ex2(23);

        s1.display();

        Ex2.change();

        s2.display();
    }
}
