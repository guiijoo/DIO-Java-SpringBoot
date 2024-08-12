package org.ultracom;
import java.util.Scanner;

import org.ultracom.servicomensagens.ServicoMensagensInstantaneas;
import org.ultracom.servicomensagens.aplicativos.Facebook;
import org.ultracom.servicomensagens.aplicativos.MSN;
import org.ultracom.servicomensagens.aplicativos.Telegram;

public class ComputadorCarlos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoMensagensInstantaneas smi = null;

        String servicoEscolhido = scanner.nextLine();

        switch (servicoEscolhido) {

            case "Facebook":
                smi = new Facebook();
                break;

            case "Telegram":
                smi = new Telegram();
                break;

            case "MSN":
                smi = new MSN();
                break;
        
            default:
                System.out.println("Sistema escolhido invalido!");
                break;
        }
        try {
            smi.enviarMensagem();
            smi.receberMensagem();
        } catch (java.lang.NullPointerException e) {
            System.out.println("Digite um sistema valido!");
        }

        scanner.close();
    }


}
