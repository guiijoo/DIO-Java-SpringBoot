package org.appagenda;

import org.appagenda.agendacontatos.AgendaContatos;

public class Usuario {

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.adicionarContato("guiijoo", 998924444);
        agendaContatos.adicionarContato("nando", 991234567);
        agendaContatos.adicionarContato("Carlos", 991444567);
        agendaContatos.adicionarContato("Carlos", 999999999);

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("carlos", 123456879);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("carlos"));
    }

    
}
