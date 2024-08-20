package org.conjuntoconvidados.convidados;

public class Convidado {
    
    private String nome;
    private int cogigoConvite;

    public Convidado(String nome, int cogigoConvite) {
        this.nome = nome;
        this.cogigoConvite = cogigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCogigoConvite() {
        return cogigoConvite;
    }

    public String toString() {
        return "Convidado [nome=" + nome + ", cogigoConvite=" + cogigoConvite + "]";
    }
        
}
