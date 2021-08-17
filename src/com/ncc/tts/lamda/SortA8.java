package com.ncc.tts.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortA8 {
    public static void main(String[] args) {

    //    List<String> l = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        List<String> l = new ArrayList<String>();
        l.add("Java");
        l.add("C#");
        l.add("C++");
        l.add("PHP");
        l.add("Javascript");
        Collections.sort(l, ( o1, o2) -> o1.compareTo(o2));

        for (String language : l) {
            System.out.println(language);
        }

//        l.forEach((element) -> {
//            System.out.println(element);
//        });

        l.forEach(System.out::println);
    }
}
