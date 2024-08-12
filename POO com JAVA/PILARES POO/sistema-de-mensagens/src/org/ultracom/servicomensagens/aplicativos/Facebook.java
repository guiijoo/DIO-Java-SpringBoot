package org.ultracom.servicomensagens.aplicativos;
import org.ultracom.servicomensagens.ServicoMensagensInstantaneas;
public class Facebook extends ServicoMensagensInstantaneas{

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    protected void salvarHistoricoMensagens() {
        System.out.println("Salvando historico de mensagens");
    }
}