package com.ncc.tts.sta_fin;
// Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)

public class Pthuc {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    static void change() {
        college = "Đại Học Công Nghệ";
    }

    Pthuc(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
//        Pthuc.change();

        Pthuc s1 = new Pthuc(111, "Thông");
        Pthuc s2 = new Pthuc(222, "Minh");
        Pthuc s3 = new Pthuc(333, "Anh");

        s1.display();
        s2.display();
        s3.display();
    }
}
