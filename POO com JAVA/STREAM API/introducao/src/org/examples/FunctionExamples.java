package org.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        Function<Integer, Integer> multiplicarPorDois = numero -> numero * 2;
        
        numeros.stream()
            .map(multiplicarPorDois)
            .forEach(System.out::println);
    }
}
