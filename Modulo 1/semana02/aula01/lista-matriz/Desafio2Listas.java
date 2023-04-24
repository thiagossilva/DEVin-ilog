import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio2Listas {
    public static void main(String[] args) {
        List<Integer> numeros2 = List.of(5, 6, 7, 8, 9, 10);
        List<Integer> numeros3= Arrays.asList(5, 6, 7, 8, 9, 10);
        List<Integer> numeros = new ArrayList<>();
        numeros.set(0, 5);
        numeros.set(1, 6);
        numeros.set(2, 7);
        numeros.set(3, 8);
        numeros.set(4, 9);
        numeros.set(5, 10);
    }
}
