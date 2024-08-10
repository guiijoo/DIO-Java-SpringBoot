package autodromo.veiculo.subveiculo;

import autodromo.veiculo.Veiculo;

public class Carro extends Veiculo{

    public void ligar() //metodo obrigatorio na herança veiculo
    {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel()
    {
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }

    private void confereCambio()
    {
        System.out.println("CONFERINDO CAMBIO EM 'P'");
    }

}
