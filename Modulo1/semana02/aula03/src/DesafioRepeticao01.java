public class DesafioRepeticao01 {
    public static void main(String[] args) {
        int[] numeros = {3, 7, -3, 0, -8, 5, -3, 15, -25};
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                negativos++;
            } else if (numeros[i] > 0) {
                positivos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Número de positivos = " + positivos);
        System.out.println("Número de negativos = " + negativos);
        System.out.println("Número de zeros = " + zeros);
    }
}
