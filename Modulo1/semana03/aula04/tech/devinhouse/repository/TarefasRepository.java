package tech.devinhouse.repository;

import tech.devinhouse.models.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefasRepository {
    private List<Tarefa> lista = new ArrayList<>();

    private static int idAtual = 0;

    public Tarefa adicioar(Tarefa tarefa) {
        tarefa.setId(++idAtual);
        lista.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> obter() {
        return new ArrayList<>(lista); // uma cópia da lista
    }

    public Tarefa obterPorId(int id) {
        for (Tarefa tarefa : lista) {
            if (tarefa.getId() == id) {
                return tarefa; // retorna a tarefa igual ao id inserido
            }
        }
        return null;
    }

    public void excluirTarefa(int id) {
        List<Tarefa> atualizada = new ArrayList<>();
        for (Tarefa tarefa : lista) {
            if (tarefa.getId() == id) {
                continue; // Se tarefa for igual ao do id continua sem exibi-la
            }
                 atualizada.add(tarefa);
        }
        lista = atualizada;
    }

    public void marcarComoConcluida(int id) {
        for (Tarefa tarefa : lista) {
            if (tarefa.getId() == id) {
                // Seta a tarefa do id inserido como concluída e para a execução do for
                tarefa.setConcluida(true);
                break;
            }
        }
    }
}
