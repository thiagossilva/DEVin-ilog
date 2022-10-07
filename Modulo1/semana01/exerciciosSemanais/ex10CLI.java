package exerciciosJava;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;


public class ex10CLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o ano do seu nascimento: ");
        int anoNasc = sc.nextInt();

        LocalDate data = LocalDate.now();

        int anoNascimento = data.getYear() - anoNasc;
        System.out.println("Usando LocalDate - sua idade é: " + anoNascimento);
        Date a = new Date();
        int ano = a.getYear();
        int anoAtual = 1900 + ano;
        int idade = anoAtual - anoNasc;

        System.out.println("Usando Date - sua idade é: " + idade);
    }
}