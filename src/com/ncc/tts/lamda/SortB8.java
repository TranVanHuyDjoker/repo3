package com.ncc.tts.lamda;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortB8 {
    public static void main(String[] args) {

        List<String> l = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String language : l) {
            System.out.println(language);
        }
    }


}
