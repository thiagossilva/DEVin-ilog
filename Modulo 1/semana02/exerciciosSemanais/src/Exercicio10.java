import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite a palavra a ser verificada: ");
//        String palavra = sc.nextLine();
//        String reverso = "";
//
//        for  (int i = (palavra.length() - 1); i >= 0; i--) {
//            reverso += palavra.charAt(i);
//        }
//        System.out.println(palavra + " " + reverso);
//        if (palavra.toLowerCase().equals(reverso.toLowerCase())) {
//            System.out.println("É um palíndromo");
//        } else {
//            System.out.println("Não é palíndromo");
//        }
        String nome = "thiago";

        String nomeInvertido = new StringBuilder(nome).reverse().toString();

        System.out.println(nomeInvertido);
    }
}
