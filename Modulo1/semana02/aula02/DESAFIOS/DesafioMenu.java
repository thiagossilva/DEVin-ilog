package DESAFIOS;
import java.util.List;
import java.util.Scanner;

public class DesafioMenu {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4);

        List<String> opcoes = List.of("1 - Primeira Opcao", "2 - Segunda Opcao",
                "3 - Terceira Opcao", "4 - Quarta Opcao");
        System.out.println(opcoes.get(0));
        System.out.println(opcoes.get(1));
        System.out.println(opcoes.get(2));
        System.out.println(opcoes.get(3));

        System.out.print("Digite a opção desejada: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.println("Opcao valida: " + numeros.contains(opcao));
    }

}