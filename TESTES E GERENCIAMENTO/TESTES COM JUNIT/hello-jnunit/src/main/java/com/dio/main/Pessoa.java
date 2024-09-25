package com.dio.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private int idade;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.dataNascimento, LocalDate.now());
    }
}
