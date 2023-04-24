import java.util.List;
import java.util.Scanner;

public class Desafio3Listas {
    public static void main(String[] args) {
        System.out.println("1 - Primeira Opção");
        System.out.println("2 - Segunda Opção");
        System.out.println("3 - Terceira Opção");
        System.out.println("4 - Quarta Opção");
        List<Integer> numeros = List.of(1, 2, 3, 4);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a opção desejada: ");
        int opcao = sc.nextInt();

        //boolean tem = numeros.contains(opcao);

        System.out.print("Opção válida: " + numeros.contains(opcao));
    }
}

