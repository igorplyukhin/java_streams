package org.secondTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class First {
    public static void main(String[] args) {
        var myList = Arrays.asList("A", "b", "C", "d");
        var x = myList.stream().map(e -> e.toLowerCase()).toArray();
        var y = myList.stream().filter(e -> e.toLowerCase().equals(e)).toArray();
        var z = myList.stream().filter(e -> e.toLowerCase().equals(e)).count();
        var w = myList.stream().reduce("", (a, b) -> a + b);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println(z);
        System.out.println(w);
    }
}
