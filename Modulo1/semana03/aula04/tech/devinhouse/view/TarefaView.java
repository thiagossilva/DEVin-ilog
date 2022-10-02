package tech.devinhouse.view;

import tech.devinhouse.models.Tarefa;
import tech.devinhouse.models.Operacao;

import java.util.List;
import java.util.Scanner;

public class TarefaView {
    public void exibirMenu() {
        System.out.println("-- Lista de tarefas --");
        System.out.println();
        System.out.println("----- MENU -----");
        System.out.println();
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Excluir tarefa");
        System.out.println("3 - Consultar tarefas");
        System.out.println("4 - Consultar por id");
        System.out.println("5 - Marcar tarefa como concluída");
        System.out.println("6 - Exportar para arquivo");
        System.out.println("7 - Sair");
        System.out.println();
    }

    public Operacao oberOpcao() {
        System.out.print("Escolha uma opcão: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        System.out.println();
        Operacao operacao = Operacao.obterPeloCodigo(opcao);
        return operacao;
    }

    public void aguardar() {
        System.out.println("Pressione qualquer tecla para continuar");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println();
    }

    public Tarefa obterDadosDaTarefa() {
        System.out.println("Informe o texto da tarefa");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println();
        Tarefa tarefa = new Tarefa(texto);
        return tarefa;
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
        System.out.println();
    }

    public void exibir(Tarefa tarefa) {
        System.out.println(tarefa);
        System.out.println();
    }

    public void exibir(List<Tarefa> tarefas) {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
        System.out.println();
    }

    public int oberIdDaTarefa() {
        System.out.print("Informe o ID: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println();
        return id;
    }

    public boolean confirmar(Tarefa tarefa) {
        exibir(tarefa);
        System.out.print("Confirma operação para essa tarefa? [s/n]: ");
        Scanner sc = new Scanner(System.in);
        String resposta = sc.next();
        System.out.println();
        return resposta.toLowerCase().equals("s");
    }
}
