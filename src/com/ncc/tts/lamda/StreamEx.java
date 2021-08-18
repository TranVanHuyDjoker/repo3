package com.ncc.tts.lamda;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);

    public void SoChan() {
        long c = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                c++;
            }
        }

        System.out.println(c);
    }

    public void SoChanStream() {
        long c = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.println( c);
    }

    public static void main(String[] args) {
        StreamEx s1 = new StreamEx();
        s1.SoChan();
        System.out.println();
        s1.SoChanStream();
    }
}
