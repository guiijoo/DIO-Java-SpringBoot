import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Por favor, digite seu CPF (sem pontuação): ");
        String cpf = scanner.nextLine();
        
        Pessoa carlosPessoa = new Pessoa(nome,cpf);
        scanner.close();

        carlosPessoa.setEndereco("CASTELO REI DE PRATÂNIA");

        System.out.println(carlosPessoa.getNome() + "-" + carlosPessoa.getCpf());
    }
}
