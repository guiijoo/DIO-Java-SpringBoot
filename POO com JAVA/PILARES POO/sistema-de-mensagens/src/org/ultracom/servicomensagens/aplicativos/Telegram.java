package org.ultracom.servicomensagens.aplicativos;
import org.ultracom.servicomensagens.ServicoMensagensInstantaneas;

public class Telegram extends ServicoMensagensInstantaneas {

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    
}
