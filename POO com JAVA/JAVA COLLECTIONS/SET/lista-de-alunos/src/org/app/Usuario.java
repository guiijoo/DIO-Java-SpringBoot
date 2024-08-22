package org.app;

import org.app.listaalunos.ListaAlunos;

public class Usuario {
    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
    ListaAlunos gerenciadorAlunos = new ListaAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador:");
    gerenciadorAlunos.exibirAlunos();

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAlunoPorMatricula(000L);
    gerenciadorAlunos.removerAlunoPorMatricula(123457L);
    gerenciadorAlunos.exibirAlunos();

    // Exibindo alunos ordenados por nome
    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

    // Exibindo alunos ordenados por nota
    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
