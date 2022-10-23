package tech.devinhouse.ex04;

import java.util.Scanner;

public class Excecoes04 {
    public static void main(String[] args) {
        boolean idadeValida = false;
        Integer idade = null;
        while (!idadeValida) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite sua idade: ");
            String entrada = sc.nextLine();
            try {
                idade = Integer.valueOf(entrada);
                if (idade <=0 || idade >100) {
                    System.out.println(idade);;
                    throw new IdadeInvalidaException();
                }
                idadeValida = true;

            } catch (NumberFormatException e) {
                System.out.println("Valor informado não númerico");
            } catch (IdadeInvalidaException e) {
                System.out.println("Idade informada é menor ou igual a 0 ou acima de 100");
            }
        }
        System.out.printf("Olá, você tem %d anos de idade!", idade);
    }
}

