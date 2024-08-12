package org.ultracom.servicomensagens.aplicativos;
import org.ultracom.servicomensagens.ServicoMensagensInstantaneas;

public class Telegram extends ServicoMensagensInstantaneas {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    protected void salvarHistoricoMensagens() {
        System.out.println("Salvando historico de mensagens");
    }    
}
