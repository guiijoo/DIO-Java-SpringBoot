package com.dio.main;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Calos Gomes Tavares", LocalDate.of(2003, 8, 15));
        Assert.assertEquals(21, pessoa.getIdade());
    }
}
