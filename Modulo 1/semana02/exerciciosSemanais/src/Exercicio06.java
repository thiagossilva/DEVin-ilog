import java.util.Arrays;
import java.util.List;

public class Exercicio06 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3 ,4);

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) * 3 + " ");
        }
    }
}
