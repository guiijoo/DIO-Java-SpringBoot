package org.app.listaalunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
    private Set<Aluno> listaAlunos;

    public ListaAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media)
    {
        listaAlunos.add(new Aluno(nome, matricula, media));
    }
    
    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!listaAlunos.isEmpty()) {
          for (Aluno a : listaAlunos) {
            if (a.getMatricula() == matricula) {
              alunoParaRemover = a;
              break;
            }
          }
          listaAlunos.remove(alunoParaRemover);
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
    
        if (alunoParaRemover == null) {
          System.out.println("Matricula não encontrada!");
        }
      }

    public Set<Aluno> exibirAlunosPorNome()
    {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        if (!listaAlunos.isEmpty()) {
            return alunosPorNome;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota()
    {
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        if (!listaAlunos.isEmpty()) {
            alunosPorNota.addAll(listaAlunos);
            return alunosPorNota;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    } 
    
    public void exibirAlunos()
    {
        System.out.println(listaAlunos);
    }
}
