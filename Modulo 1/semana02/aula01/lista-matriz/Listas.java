import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // List.of cria uma lista com valores imutáveis
        List<Long> numerosVarios = new ArrayList<>(); // Cria uma lista vazia
        System.out.println(numerosVarios);

        List<Long> numeros = Arrays.asList(10l, 25l, 543l, 54l);
        System.out.println(numeros);

        List<Long> copia = new ArrayList<>(numeros);
        System.out.println(copia);

    }
}
