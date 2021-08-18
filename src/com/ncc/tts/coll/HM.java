package com.ncc.tts.coll;

import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Java");
        hm.put(3, "C++");
        hm.put(2, "PHP");
        hm.put(4, "Python");
        System.out.println(hm);

        for(Map.Entry<Integer, String> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
