package org.firstTask;

import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        new Random()
                .ints(1000, 10, 10000)
                .forEach(e -> System.out.println(e));
    }
}
