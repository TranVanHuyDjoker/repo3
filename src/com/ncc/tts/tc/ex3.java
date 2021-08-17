package com.ncc.tts.tc;

import java.io.IOException;

public class ex3 {
    void method() throws IOException {
        throw new IOException("device error");
    }

    public static void main(String args[]) {
        try {
            ex3 obj = new ex3();
            obj.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }
}
