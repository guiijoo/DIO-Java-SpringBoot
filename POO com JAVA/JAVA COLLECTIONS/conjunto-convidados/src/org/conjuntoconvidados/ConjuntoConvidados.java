package org.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;

import org.conjuntoconvidados.convidados.Convidado;

public class ConjuntoConvidados {
    
    Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite)
    {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite)
    {
        Set<Convidado> convidadosParaRetirar = new HashSet<>();
        if(!convidadosSet.isEmpty())
        {
            for(Convidado convidado : convidadosSet)
            {
                if(convidado.getCogigoConvite() == codigoConvite)
                {
                    convidadosParaRetirar.add(convidado);
                }
            }
            convidadosSet.removeAll(convidadosParaRetirar);
        }else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public int contarConvidados()
    {
        return convidadosSet.size();
    }

    public void exibirConvidados()
    {
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        }else{
            System.out.println("A lista está vazia!");
        }
    }
    
}
