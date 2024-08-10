package autodromo;

import autodromo.veiculo.subveiculo.Carro;
import autodromo.veiculo.subveiculo.Moto;

public class Autodromo {
    public static void main(String[] args) {

        Carro uno = new Carro();
        uno.setChassi("3123");
        uno.ligar();


        Moto lambreta = new Moto();
        lambreta.setChassi("412137");
        lambreta.ligar();
    }
}
