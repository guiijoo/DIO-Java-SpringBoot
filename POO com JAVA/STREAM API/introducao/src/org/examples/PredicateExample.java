package org.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> linguagensProgramacao = Arrays.asList("Java", "Python", "JavaScript", "C++", "Ruby");

        Predicate<String> maisDeCincoCaracteres = linguagem -> linguagem.length() > 5;

        linguagensProgramacao.stream()
            .filter(maisDeCincoCaracteres)
            .forEach(System.out::println);
    }
}
