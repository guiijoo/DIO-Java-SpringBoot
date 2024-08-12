package org.ultracom.servicomensagens;
public abstract class ServicoMensagensInstantaneas {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected abstract void salvarHistoricoMensagens();

    protected void validarConexaoInternet()
    {
        System.out.println("Testando conexao com a internet");
    }

}