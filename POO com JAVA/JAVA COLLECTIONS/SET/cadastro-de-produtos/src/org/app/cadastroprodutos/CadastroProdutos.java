package org.app.cadastroprodutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    Set<Produto> listaProdutos;


    public CadastroProdutos() {
        this.listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade)
    {
        listaProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome()
    {
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        if (!listaProdutos.isEmpty()) {
            return produtosPorNome;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!listaProdutos.isEmpty()) {
          produtosPorPreco.addAll(listaProdutos);
          return produtosPorPreco;
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
      }

}
