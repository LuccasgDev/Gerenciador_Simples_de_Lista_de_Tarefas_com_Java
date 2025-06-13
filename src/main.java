import java.util.List;

public class main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

   
        lista.adcionarTarefas("Comprar leite");
        lista.adcionarTarefas("Enviar relatório");

        // 2) Ver quantas estão
        System.out.println(lista.obterNumeroTotalTarefas());
        // → 2

        // 3) Listar descrições
        List<String> descricoes = lista.obterDescricoesTarefas();
        descricoes.forEach(System.out::println);
        // → Comprar leite
        //   → Enviar relatório

        // 4) Remover uma
        lista.removerTarefa("Comprar leite");
        System.out.println(lista.obterNumeroTotalTarefas());
        // → 1
    }
}
