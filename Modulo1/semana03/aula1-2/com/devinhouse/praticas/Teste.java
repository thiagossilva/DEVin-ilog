package com.devinhouse.praticas;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        pessoa.setNome(nome);

        String sobrenome = sc.nextLine();
        pessoa.setSobrenome(sobrenome);

        System.out.println(pessoa.nomeCompleto());

    }
}
