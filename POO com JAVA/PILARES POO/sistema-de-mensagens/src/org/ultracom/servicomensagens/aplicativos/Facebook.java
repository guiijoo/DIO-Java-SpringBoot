package org.ultracom.servicomensagens.aplicativos;
import org.ultracom.servicomensagens.ServicoMensagensInstantaneas;
public class Facebook extends ServicoMensagensInstantaneas{

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

}