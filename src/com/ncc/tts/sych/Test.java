package com.ncc.tts.sych;

public class Test {
    public static void main(String args[]) {
        Table obj = new Table();

        Thread t1 = new Thread() {
            public void run() {
                obj.in(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.in(100);
            }
        };

        t1.start();
        t2.start();
    }
}
