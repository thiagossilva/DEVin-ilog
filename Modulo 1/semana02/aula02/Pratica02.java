
public class Pratica02 {

    // Calcular média de notas e imprimir se aprovado (média >= 7)

    public static void main(String[] args) {

        float[] notas = { 10f, 5f, 7f, 8.5f };
        float media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;
//        boolean passou;
//        if (media >= 7) {
//            passou = true;
//        } else {
//            passou = false;
//        }

//        boolean passou = media >= 7 ? true : false;

        boolean passou = media >= 7;

        System.out.println(String.format("Media = %.2f e passou = %s", media, passou));

    }

}
