package org.firstTask;

import java.util.Random;

public class Third {
    public static void main(String[] args) {
        var x = new Random()
                .ints(1000, 10, 10000)
                .reduce(0, (a, b) -> a + b);
        System.out.println(x);
    }
}
