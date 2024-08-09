package lanchonete.area.cliente;

public class Cliente {
    
    public void escolherLanche()
    {
        System.out.println("escolhendo lanche");
    }

    public void fazerPedido()
    {  
        System.out.println("fazendo pedido");
    }

    public void pagarConta()
    {
        consultarSaldoAplicativo();
        System.out.println("pagando conta");
    }

    private void consultarSaldoAplicativo()
    {
        System.out.println("consultando saldo no aplicativo");
    }
}
