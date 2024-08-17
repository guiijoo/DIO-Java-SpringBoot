import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao)
    {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao)
    {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList)
        {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
                
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public Integer obterNumeroTotalTarefas()
    {
        return tarefaList.size();
    }
    
    public void obterDescricoesTarefas()
    {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa3");
        listaTarefa.adicionarTarefa("Tarefa2");
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");

        System.out.println("Numero total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa1");

        listaTarefa.obterDescricoesTarefas();

        System.out.println("Numero total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

    }
}
