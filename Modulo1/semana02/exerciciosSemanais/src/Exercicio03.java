public class Exercicio03 {
    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        for (int i = 0; i < extrato.length; i++) {
            System.out.print(extrato[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < extrato.length; i++) {
            System.out.print(extrato[extrato.length - i - 1] + " ");
        }
//        Outra suloção para inverter o array
//        System.out.println();
//        for (int i = 5; i <= extrato.length; i--) {
//            System.out.print(extrato[i] + " ");
//            if (i <= 0) {
//               break;
//            }
//        }

        int saldo = 0;
        for (int i = 0; i < extrato.length; i++) {
            saldo += extrato[i];


        }
        System.out.println();
        if (saldo > 0 ) {
            System.out.printf("O saldo de: %d é positivo", saldo);
        } else {
            System.out.printf("O saldo de: %d é negativo", saldo);
        }
    }
}
