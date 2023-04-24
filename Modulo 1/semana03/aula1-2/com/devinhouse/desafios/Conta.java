package com.devinhouse.desafios;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculadoraGorjetas calculadora = new CalculadoraGorjetas();

        System.out.print("Digite o valor da conta: ");
        double valor = sc.nextDouble();

        calculadora.setConta(valor);

        System.out.print("Digite o valor da gorjeta: ");
        double gorjeta = sc.nextDouble();
        calculadora.setGorjeta(gorjeta);
        double resultado = calculadora.calcularGorjeta();

        System.out.println("O valor da gorjeta é: " + resultado);
    }
}
