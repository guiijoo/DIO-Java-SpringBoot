package org.ultracom.servicomensagens;
public class ServicoMensagensInstantaneas {

    public void enviarMensagem()
    {
        validandoInternet();
        System.out.println("enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem()
    {
        System.out.println("recebendo mensagem");
    }
    
    private void validandoInternet()
    {
        System.out.println("Verificando conexão com a internet");
    }

    private void salvarHistoricoMensagem()
    {
        System.out.println("salvando mensagem no historico");
    }
}