package escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        Aluno carlosAluno = new Aluno();

        // carlosAluno.nome = "Carlos Gomes Tavares";
        // carlosAluno.idade = 20;

        carlosAluno.setNome(inputScanner.nextLine());
        carlosAluno.setIdade(inputScanner.nextInt());

        System.out.println("Olá "+carlosAluno.getNome()+"! Você tem "+carlosAluno.getIdade()+" anos!");
        inputScanner.close();
    }
}
