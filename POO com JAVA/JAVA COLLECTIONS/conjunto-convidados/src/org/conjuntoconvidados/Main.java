package org.conjuntoconvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Carlos Gomes Tavares", 1);
        conjuntoConvidados.adicionarConvidado("Luis Guilherme Josepette Marchetto", 2);
        conjuntoConvidados.adicionarConvidado("Wagner Toninho", 3);
        conjuntoConvidados.adicionarConvidado("Rei de pratania", 4);

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

    }
}
