package DESAFIOS;

import java.util.Locale;
import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double calcIMC = peso / (altura * altura);

        if (calcIMC < 18.5) {
            System.out.println("Magreza");
        } else if (calcIMC <= 24.9) {
            System.out.println("Normal");
        } else if (calcIMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (calcIMC <= 39.9) {
            System.out.println("Obesidade");
        }
        else {
            System.out.println("Obesidade grave");
        }

    }
}
