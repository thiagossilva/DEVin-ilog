public class Exercicio02 {
    public static void main(String[] args) {
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };
        System.out.println("Primeiro elemento do terceiro array" + notas[2][0]);
        System.out.println("Segundo elemento do quarto array " + notas[3][1]);
        double soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
        for (int i = 0; i < notas.length; i++) {
            soma1 += notas[0][i];
            soma2 += notas[1][i];
            soma3 += notas[2][i];
            soma4 += notas[3][i];
        }

        System.out.println("Primeira nota = " + soma1);
        System.out.println("Segunda nota = " + soma2);
        System.out.println("Terceiraa nota = " + soma3);
        System.out.println("Quarta nota = " + soma4);



    }
}
