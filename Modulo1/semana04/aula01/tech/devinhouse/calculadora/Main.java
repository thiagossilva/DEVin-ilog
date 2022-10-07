package tech.devinhouse.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);

        Operacao operacao = null;
        double n1 = 0, n2 = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o tipo de operação");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int tipo = sc.nextInt();

            System.out.print("Digite o primeiro valor: ");
            n1 = sc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            n2 = sc.nextDouble();


            if (tipo == 1) {
                operacao = new Adicao();

            } else if (tipo == 2) {
                operacao = new Subtracao();
            } else if (tipo == 3) {
                operacao = new Multiplicacao();
            } else if (tipo == 4) {
                operacao = new Divisao();
            } else {
                System.out.println("Opção inválida");

            }
        } catch (CalculadoraException e) {
            e.getMessage();
            e.printStackTrace();
        }
            double resultado = operacao.calcular(n1, n2);
            String tipoResult = operacao.getDescricao();
            System.out.printf("O resultado é:  %.2f %ne o tipo da operação é: ", resultado, tipoResult);
    }

}
