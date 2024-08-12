package org.ultracom.servicomensagens.aplicativos;
import org.ultracom.servicomensagens.ServicoMensagensInstantaneas;

public class MSN extends ServicoMensagensInstantaneas {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
    
    protected void salvarHistoricoMensagens() {
        System.out.println("Salvando historico de mensagens");
    }
}
