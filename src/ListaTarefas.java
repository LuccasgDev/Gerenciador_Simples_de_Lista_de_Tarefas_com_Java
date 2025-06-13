import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {

	private List<Tarefa> tarefas = new ArrayList<>();
	
	public void adcionarTarefas(String descricao) {
		Tarefa tasks_new = new Tarefa(descricao);
		tarefas.add(tasks_new);
	}
	
	public void removerTarefa(String descricao) {
		tarefas.removeIf(t -> t.getDescricao().equals(descricao));
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefas.size();
	}
	
	public List<String> obterDescricoesTarefas() {
	    return tarefas.stream()
	                  .map(Tarefa::getDescricao)
	                  .collect(Collectors.toList());
	}

	
}
