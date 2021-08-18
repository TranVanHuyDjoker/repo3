package com.ncc.tts.ArrayL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//truy xuat ptu
public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("a");
        System.out.println(a);

//        for(int i=0; i<a.size(); i++){
//            System.out.println(a.get(3));
//        }
        System.out.println("---");
        for (String s: a) {
            System.out.println(s);
        }

        System.out.println("---");
        Iterator<String> i = a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("---");
        ListIterator<String> ii= a.listIterator();
        while(ii.hasNext()){
            System.out.println(ii.next());
        }

        System.out.println("---");
        a.set(4,"e");
        System.out.println(a);

        System.out.println("---");
        a.remove("e");
        System.out.println(a);


    }
}
