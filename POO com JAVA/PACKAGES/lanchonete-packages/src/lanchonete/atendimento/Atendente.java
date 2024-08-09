package lanchonete.atendimento;

public class Atendente {
 
    public void servindoMesa()
    {
        pegarLancheCozinha();
        System.out.println("servindo mesa");
    }

    private void pegarLancheCozinha()
    {
        System.out.println("pegar lanche na cozinha");
    }

    public void receberPagamento()
    {
        System.out.println("recebendo pagamento");
    }

    void trocarGas()
    {
        System.out.println("atendente trocando o gas");
    }

    private void pegarPedidoBalcao()
    {
        System.out.println("pegando pedido do balcao");
    }
    
}
