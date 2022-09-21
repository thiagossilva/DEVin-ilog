import java.util.Locale;

public class Perimetro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float pi = 3.14f, r = 2, c = 0;



        c = 2 * pi * r;

        System.out.printf("O resultado do perimetro é %.2f", c);

    }
}
