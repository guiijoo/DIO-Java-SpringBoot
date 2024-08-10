package autodromo.veiculo;

public abstract class Veiculo { //todos as classe que possurem um extend de veiculo ira receber a variavel chassi e obrigatoriamente devem ter o metodo ligar

    public String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
