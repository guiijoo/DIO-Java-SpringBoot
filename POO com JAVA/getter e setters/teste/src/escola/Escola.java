package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno carlosAluno = new Aluno();
        carlosAluno.nome = "Carlos Gomes Tavares";
        carlosAluno.idade = 20;

        System.out.println("Olá "+carlosAluno.nome+"! Você tem "+carlosAluno.idade+" anos de idade!");
    }
}
