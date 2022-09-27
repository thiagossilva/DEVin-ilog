import java.util.Arrays;
import java.util.List;

public class Exercicio07 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        System.out.printf("Repetição for%n");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.print(nomes.get(i) + " ");
        }
        System.out.printf("%n%nLaço for each %n");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.printf("%n%nRepetição while %n");
        int itera = 0;
        while (itera < nomes.size()) {
            System.out.print(nomes.get(itera) + " ");
            itera++;
        }
    }
}
