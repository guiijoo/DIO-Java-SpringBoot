package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    
    public void adicionarLancheNoBalcao()
    {
        System.out.println("Adicionar lanche ao balcao");
    }

    public void adicionarSucoNoBalcao()
    {
        System.out.println("Adicionar suco ao balcao");
    }

    public void adicionarComboNoBalcao()
    {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche()
    {
        System.out.println("preparando lanche");
    }

    public void prepararVitamina()
    {
        System.out.println("preparando suco");
    }

    public void prepararCombo()
    {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche()
    {
        System.out.println("selecionando ingrediente do lanhce");
    }

    public void selecionarIngredientesVitamina()
    {
        System.out.println("selecionando ingrediente da vitamina");
    }

    public void lavarIngredientes()
    {
        System.out.println("lavando ingredientes");
    }

    public void baterVitaminaLiquidificador()
    {
        System.out.println("processando vitamina");
    }

    public void fritarIngredientesLanche()
    {
        System.out.println("fritando ingredientes");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo)
    {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo)
    {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife)
    {
        almoxarife.entregarIngredientes();
    }
}
