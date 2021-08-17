package com.ncc.tts.coll;

import java.util.HashSet;

public class HS {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: ");

        for (String element : setA) {
            System.out.println(element);
        }

        setA.remove("PHP");
        System.out.println("Các phần tử của setA sau khi xóa: ");
        for (String element : setA) {
            System.out.println(element);
        }
    }
}
