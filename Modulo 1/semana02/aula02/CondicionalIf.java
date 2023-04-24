import java.util.Scanner;

public class CondicionalIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade < 12) {
            System.out.println("É criança");
        } else if (idade < 18) {
            System.out.println("É adolescente");
        }
        else if (idade <60) {
            System.out.println("É Adulto");
        }
        else
            System.out.println("É idoso");


    }
}
