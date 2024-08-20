package org.conjuntopalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> conjuntoPalavras;
    
    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }
    
    public String toString() {
        return "ConjuntoPalavrasUnicas [conjuntoPalavras=" + conjuntoPalavras + "]";
    }

    public void adicionarPalavra(String palavra)
    {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra)
    {
        Set<String> removerPalavras = new HashSet<>();
        if(!conjuntoPalavras.isEmpty())
        {
            for(String p : conjuntoPalavras)
            {
                if(p == palavra)
                {
                    removerPalavras.add(palavra);
                }
            }
            conjuntoPalavras.removeAll(removerPalavras);
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }   

    public Boolean verificarPalavra(String palavra)
    {
        boolean verificado = false;
        if(!conjuntoPalavras.isEmpty())
        {
            for(String p : conjuntoPalavras)
            {
                if(p == palavra)
                {
                    verificado = true;
                    break;
                }
            }
            return verificado;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirPalavrasUnicas()
    {
        if (!conjuntoPalavras.isEmpty()) {
            System.out.println(conjuntoPalavras);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
}
