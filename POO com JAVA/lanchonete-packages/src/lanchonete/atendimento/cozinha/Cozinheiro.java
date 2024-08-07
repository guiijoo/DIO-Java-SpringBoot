package lanchonete.atendimento.cozinha;


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

    private void prepararLanche()
    {
        System.out.println("preparando lanche");
    }

    private void prepararVitamina()
    {
        System.out.println("preparando suco");
    }

    private void prepararCombo()
    {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche()
    {
        System.out.println("selecionando ingrediente do lanhce");
    }

    private void selecionarIngredientesVitamina()
    {
        System.out.println("selecionando ingrediente da vitamina");
    }

    private void lavarIngredientes()
    {
        System.out.println("lavando ingredientes");
    }

    private void baterVitaminaLiquidificador()
    {
        System.out.println("processando vitamina");
    }

    private void fritarIngredientesLanche()
    {
        System.out.println("fritando ingredientes");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo)
    {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife)
    {
        almoxarife.entregarIngredientes();
    }
}
