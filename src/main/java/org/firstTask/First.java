package org.firstTask;

import java.util.Random;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        var x = new Random()
                .ints(1000, 10, 10000)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(x);
    }
}
