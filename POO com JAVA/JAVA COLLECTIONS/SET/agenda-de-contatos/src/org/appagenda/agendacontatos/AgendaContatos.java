package org.appagenda.agendacontatos;

import java.util.HashSet;
import java.util.Set;

import org.appagenda.agendacontatos.contato.Contato;

public class AgendaContatos {

    private Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        this.conjuntoContatos = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero)
    {
        conjuntoContatos.add(new Contato(nome, numero));
    }    
    
    public void exibirContatos()
    {
        if(!conjuntoContatos.isEmpty())
        {
            System.out.println(conjuntoContatos);
        }else{
            System.out.println("Você não possui nenhum contato");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome)
    {
        Set<Contato> contatosPesquisados = new HashSet<>();
        if (!conjuntoContatos.isEmpty()) {
            for(Contato contato : conjuntoContatos)
            {
                if (contato.getNome().startsWith(nome)) {
                    contatosPesquisados.add(contato);
                }
            }            
            return contatosPesquisados;
        }else{
            throw new RuntimeException("Você não possui nenhum contato!");
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero)
    {
        if (!conjuntoContatos.isEmpty()) {
            for(Contato contato : conjuntoContatos)
            {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);
                    break;
                }
            }        
            System.out.println("Contato atualizado!");    
        }else{
            throw new RuntimeException("Você não possui nenhum contato!");
        }
    }
}
