import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero)
    {
        listaNumeros.add(numero);
    }

    public Integer calcularSoma()
    {
        int soma = 0;
        if(!listaNumeros.isEmpty())
        {
            for(int numero : listaNumeros)
            {
                soma += numero;
            }
            return soma;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer encontrarMaiorNumero()
    {
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaNumeros.isEmpty())
        {
            for(int numero : listaNumeros)
            {
                if(maiorNumero < numero)
                {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public Integer encontrarMenorNumero()
    {
        int menorNumero = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty())
        {
            for(int numero : listaNumeros)
            {
                if(menorNumero > numero)
                {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros()
    {
        if(!listaNumeros.isEmpty())
        {
            System.out.println(this.listaNumeros);
        }else{
            System.out.println("Lista Vazia!");
        }
    }

}
