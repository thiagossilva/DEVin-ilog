package tech.devinhouse;

import tech.devinhouse.models.Operacao;
import tech.devinhouse.repository.ArquivoRepository;
import tech.devinhouse.repository.TarefasRepository;
import tech.devinhouse.view.TarefaView;
import tech.devinhouse.models.Tarefa;

import java.io.IOException;
import java.util.List;

public class Aplicacao {

    private TarefaView view = new TarefaView();
    private TarefasRepository repo = new TarefasRepository();

    public void executar()  throws IOException {
        Operacao operacao = null;
        while (operacao == null || operacao != Operacao.SAIR) {
            view.exibirMenu();
            operacao = view.oberOpcao();
            processar(operacao);
        }
        System.out.println("Fim");
    }

    private void processar(Operacao operacao) throws IOException {
        if (operacao == null) {
            view.mostrarMensagem("Opção inválida");
            view.aguardar();
        } else if (operacao == Operacao.ADICIONAR) {
            Tarefa tarefa = view.obterDadosDaTarefa();
            tarefa = repo.adicioar(tarefa);
            view.mostrarMensagem("Tarefa adicionada com id = " + tarefa.getId());
            view.aguardar();
        } else if (operacao == Operacao.LISTAR) {
            List<Tarefa> tarefas = repo.obter();
            view.exibir(tarefas);
            view.aguardar();
        } else if (operacao == Operacao.LISTAR_POR_ID) {
            int id = view.oberIdDaTarefa();
            Tarefa tarefa = repo.obterPorId(id);
            view.exibir(tarefa);
            view.aguardar();
        } else if (operacao == Operacao.EXCLUIR) {
            int id = view.oberIdDaTarefa();
            Tarefa tarefa = repo.obterPorId(id);
            boolean confirmado = view.confirmar(tarefa);
            if (confirmado) {
                repo.excluirTarefa(id);
                view.mostrarMensagem("Tarefa excluída");
            }
            view.aguardar();
        } else if (operacao == Operacao.MARCAR_CONCLUIDO) {
            int id = view.oberIdDaTarefa();
            Tarefa tarefa = repo.obterPorId(id);
            boolean confirmado = view.confirmar(tarefa);
            if (confirmado) {
                repo.marcarComoConcluida(id);
                view.mostrarMensagem("Tarefa marcada como concluída");
            }
            view.aguardar();
        } else if (operacao == Operacao.EXPORTAR) {
            List<Tarefa> tarefas = repo.obter();
            ArquivoRepository.gerar("Tarefax.txt", tarefas);
            view.mostrarMensagem("Arquivo gerado com sucesso!");
            view.aguardar();
        }
    }
}
