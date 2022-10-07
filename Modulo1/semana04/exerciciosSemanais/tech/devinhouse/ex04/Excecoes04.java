package tech.devinhouse.ex04;

import java.util.Scanner;

public class Excecoes04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade =0;
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        try {
            if (idade <=0 || idade >100) {
                System.out.println(idade);;
                throw new IllegalArgumentException("Idade não pode ser 0, negativa ou superior a 100");
            } else {
                System.out.printf("Olá, você tem %d anos de idade!", idade);
            }


        } catch (IllegalArgumentException e) {

            e.printStackTrace();
            }

        }
}

