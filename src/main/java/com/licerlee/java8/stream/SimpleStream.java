package com.licerlee.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c","aaa","abc","bd","a2");

        list.stream()
                .filter(a -> a.startsWith("a"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        list.stream()
                .filter(a-> a.contains("b"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
