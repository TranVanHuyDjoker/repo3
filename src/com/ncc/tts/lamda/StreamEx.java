package com.ncc.tts.lamda;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);

    public void withoutStream() {
        long count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.printf("There are %d elements that are even", count);
    }

    public void withStream() {
        long count = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.printf("There are %d elements that are even", count);
    }

    public static void main(String[] args) {
        StreamEx s1 = new StreamEx();
        s1.withoutStream();
        System.out.println();
        s1.withStream();
    }
}
