import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero)
    {
        listaNumeros.add(numero);
    }  
    
    public List<Integer> ordernarAscendente()
    {
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);
        if(!listaNumeros.isEmpty())
        {
            Collections.sort(listaOrdenada);
            return listaOrdenada;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDescendente()
    {
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);
        if(!listaNumeros.isEmpty())
        {
            listaOrdenada.sort(Collections.reverseOrder());
            return listaOrdenada;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirNumeros()
    {
        if(!listaNumeros.isEmpty())
        {
            System.out.println(listaNumeros);
        }else{
            System.out.println("Lista vazia!");
        }
    }
}