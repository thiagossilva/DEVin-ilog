package exerciciosJava;

import java.util.Scanner;

public class ex9CLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do seu herói favorito: ");
        String heroi = sc.nextLine();

        System.out.println("Seu herói favorito é " + heroi);

    }
}
