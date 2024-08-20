import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo!");
        System.out.println("Por favor, insira os dados solicitados abaixo:");

        System.out.print("Numero da Conta: ");
        int nConta = sc.nextInt();

        System.out.print("Agencia: ");
        String agencia = sc.next();

        System.out.print("Nome:");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("\nOlá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + nConta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
