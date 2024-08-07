package lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada()
    {
        System.out.println("controlando entrada de itens");
    }

    private void controlarSaida()
    {
        System.out.println("controlando saida de itens");
    }

    void entregarIngredientes()
    {
        System.out.println("entregando ingredientes");
        controlarSaida();
    }
    
   void trocarGas()
    {
        System.out.println("almoxarife trocando gas");
    }
    
}
