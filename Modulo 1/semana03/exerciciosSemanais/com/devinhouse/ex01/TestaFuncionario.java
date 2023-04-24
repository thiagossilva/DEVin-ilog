package com.devinhouse.ex01;

import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Insira o valor do salário: ");
        float salario = sc.nextFloat();

        funcionario.setNomeCompleto(nome);
        funcionario.setCPF(cpf);
        funcionario.setSalario(salario);

        System.out.print("Digite qual será a porcentagem de aumento: ");
        float porcent = sc.nextInt();

        float promocao = funcionario.promover(porcent);

        System.out.println(funcionario + "\n O aumento será de: " + promocao);


    }
}
