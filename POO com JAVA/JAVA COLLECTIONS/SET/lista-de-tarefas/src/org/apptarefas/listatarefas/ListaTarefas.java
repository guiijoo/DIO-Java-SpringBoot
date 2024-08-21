package org.apptarefas.listatarefas;

import java.util.HashSet;
import java.util.Set;

import org.apptarefas.listatarefas.tarefa.Tarefa;

public class ListaTarefas {
    Set<Tarefa> listatarefas;

    public ListaTarefas() {
        this.listatarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao)
    {
        listatarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao)
    {
        Tarefa removerTarefa = null;
        if (!listatarefas.isEmpty()) {
            for (Tarefa tarefa : listatarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    removerTarefa = tarefa;
                    break;
                }
            }
            listatarefas.remove(removerTarefa);
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        if (removerTarefa == null) {
            System.out.println("Tarefa não encontrada!");            
        }
    }

    public void exibirTarefas()
    {
        if (!listatarefas.isEmpty()) {
            System.out.println(listatarefas);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public Integer contarTarefas()
    {
        return listatarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas()
    {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!listatarefas.isEmpty()) {
            for (Tarefa tarefa : tarefasConcluidas) {
                if (tarefa.isCompleta()) {
                    tarefasConcluidas.add(tarefa);                    
                }
            }
            return tarefasConcluidas;      
        }else{
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public Set<Tarefa> obterTarefasPendentes()
    {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!listatarefas.isEmpty()) {
            for (Tarefa tarefa : tarefasPendentes) {
                if (!tarefa.isCompleta()) {
                    tarefasPendentes.add(tarefa);                    
                }
            }
            return tarefasPendentes;      
        }else{
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public void marcarTarefaConcluida(String descricao)
    {
        if (!listatarefas.isEmpty()) {
            for (Tarefa tarefa : listatarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setCompleta(true);
                }
            }
            System.out.println("Tarefa concluida!");
        } else {
            System.out.println("A Lista está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao)
    {
        if (!listatarefas.isEmpty()) {
            for (Tarefa tarefa : listatarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setCompleta(false);
                }
            }
            System.out.println("Tarefa pendente!");
        } else {
            System.out.println("A Lista está vazia!");
        }
    }

    public void limparListaTarefas()
    {
        if (!listatarefas.isEmpty()) {
            System.out.println("A lista ja está vazia!");
        } else {
            listatarefas.clear();      
            System.out.println("Lista limpa com sucesso!");      
        }
    }

}
