public class Main {
    public static void main(String[] args) {
        
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Carlos", 25, 1.3);
        ordenacaoPessoas.adicionarPessoa("Guiijoo", 21, 1.85);
        ordenacaoPessoas.adicionarPessoa("Nando", 2231, 2.87);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        System.out.println(ordenacaoPessoas.ordenarPorIdade());

    }
}
