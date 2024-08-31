package org.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> System.out.println("número par = " + numero);

    Predicate<Integer> par = numero -> numero % 2 == 0;


    // Usar o Consumer para imprimir números pares no Stream
    numeros.stream().filter(par).forEach(imprimirNumeroPar);
  }
}
