import java.util.Arrays;
import java.util.List;

public class Exercicio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        int primeiroMaior = numeros.stream().filter(x -> x > 50).findFirst().get();

        System.out.println(primeiroMaior);
    }
}
