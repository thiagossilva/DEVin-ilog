package com.devinhouse.praticas.personagem;

import java.time.LocalDate;

import java.util.Scanner;

public class CriaPersonagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personagem personagem = new Personagem();

        System.out.print("Digite o nome do personagem: ");
        String nome = sc.nextLine();
        System.out.print("Digite o nome do filme ou seriado: ");
        String referencia = sc.nextLine();

        System.out.print("Digite a idade do personagem: ");
        int idade = sc.nextInt();

        personagem.setNome(nome);
        personagem.setReferencia(referencia);
        personagem.setIdade(idade);
        personagem.setDataCadastro(LocalDate.now());
        System.out.println(personagem.oberNomeEmMaiusculo());
        System.out.println(personagem.obterTresPrimeirasLetras());
        System.out.println(personagem);


    }
}
