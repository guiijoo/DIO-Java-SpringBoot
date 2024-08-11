package org.ultracom;
import org.ultracom.servicomensagens.aplicativos.Facebook;
import org.ultracom.servicomensagens.aplicativos.MSN;
import org.ultracom.servicomensagens.aplicativos.Telegram;

public class ComputadorCarlos {
    
    public static void main(String[] args) {
        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();

        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        facebook.receberMensagem();
    
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }


}
