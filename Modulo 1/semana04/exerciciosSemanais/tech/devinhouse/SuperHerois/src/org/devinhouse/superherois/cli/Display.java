package org.devinhouse.superherois.cli;


import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.models.*;
import org.devinhouse.superherois.models.Operacao;

import java.util.List;
import java.util.Scanner;

public class Display {
    public void exibirMenu() {
        System.out.println();
        System.out.println("---- MENU ----");
        System.out.println("1 - Cadastrar herói");
        System.out.println("2 - Cadastrar vilão ");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
        System.out.println();
    }

    public Operacao obterOperacao() throws OpcaoInvalidaException {
        System.out.print("Insira a opção: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        if (opcao < 0 || opcao > Operacao.values().length) {
            throw new OpcaoInvalidaException();
        }
        Operacao operacoes = Operacao.obterCodigo(opcao);
        return operacoes;
    }

    public Personagem cadastrar(TipoPersonagem tipo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do personagem");
        String nome = sc.nextLine();
        System.out.println("Informe qual o superpoder ele possui");
        String poder = sc.nextLine();
        Personagem personagem = null;
        if (tipo == TipoPersonagem.HEROI) {
            System.out.println("Informe o nome na vida real");
            String outroNome = sc.nextLine();
            System.out.println();
            personagem = new Heroi(nome, poder, outroNome);
        }else if (tipo == TipoPersonagem.VILAO) {
            System.out.println("Informe o tempo de prisão");
            String tempoPrisao = sc.nextLine();
            System.out.println();
            personagem = new Vilao(nome, poder, Integer.valueOf(tempoPrisao));
        }
        return personagem;
    }

    public void exibirMsg(String msg) {
        System.out.println(msg);
    }

    public void aguardar() {
        System.out.println("Pressione enter para continuar");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println();
    }

    // lista os personagens existentes na lista "Personagem"
    public void listar(List<Personagem> personagens) {
        for (Personagem personagem: personagens) {
            System.out.println(personagem);
        }
    }
}
