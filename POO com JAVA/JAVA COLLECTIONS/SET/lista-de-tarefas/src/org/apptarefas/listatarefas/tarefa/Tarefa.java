package org.apptarefas.listatarefas.tarefa;

public class Tarefa {
    
    private String descricao;
    private boolean completa;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public String toString() {
        return "Tarefa [descricao=" + descricao + ", completa=" + completa + "]";
    }

}
