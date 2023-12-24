package org.firstTask;

import java.util.Random;

public class Second {
    public static void main(String[] args) {
        var x = new Random()
                .ints(1000, 10, 10000)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(x);
    }
}