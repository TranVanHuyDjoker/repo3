package com.ncc.tts.lamda;

public class Lam2 {
    public static void main(String[] args) {
        Say s1= (name) -> { return "chao, " + name; };
        System.out.println(s1.say("mn"));

        Say s2 = name -> {return "chao, " + name; };
        System.out.println(s2.say("mn"));

        Say s3 = name -> "chao, " + name;
        System.out.println(s3.say("mn"));

    }
}
