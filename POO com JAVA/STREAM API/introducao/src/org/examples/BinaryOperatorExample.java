package org.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        // Criar uma função que soma dois números
        BinaryOperator<Integer> soma = (numero1, numero2) -> numero1 + numero2;
        
        // Usar o BinaryOperator para somar todos os números da lista
        int somaTotal = numeros.stream()
        .reduce(0, soma);
        
        // Imprimir a soma total
        System.out.println("Soma total: " + somaTotal);
    }
}
