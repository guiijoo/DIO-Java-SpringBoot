import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao)
    {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor)
    {
        List<Livro> listaPesquisa = new ArrayList<>();
        if(!listaLivros.isEmpty())
        {
            for(Livro livro : listaLivros)
            {
                if (livro.getAutor().equalsIgnoreCase(autor)) 
                {
                    listaPesquisa.add(livro);
                }
            }
        }
        return listaPesquisa;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)
    {
        List<Livro> listaPesquisa = new ArrayList<>();
        if(!listaLivros.isEmpty())
        {
            for(Livro livro : listaLivros)
            {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                {
                    listaPesquisa.add(livro);
                }
            }
        }
        return listaPesquisa;
    }

    public Livro pesquisarPorTitulo(String titulo)
    {
        Livro livroPesquisa = null;

        if(!listaLivros.isEmpty())
        {
            for(Livro livro : listaLivros)
            {
                if(livro.getTitulo().equalsIgnoreCase(titulo))
                {
                    livroPesquisa = livro;
                    break;
                }
            }
        }
        return livroPesquisa;
    }

}
