public class Exercicio05 {
    public static void main(String[] args) {
       int[] array1 = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
//       int[] array2 = {1};
//       int[] array3 = null;
//       int[] array4 = {-2, -2, -2, -2};
//       int[] array5 = {20, 10, 30};

        int menor = 0, maior = 0;
       if (array1 == null) {
           System.out.println("Não é possível calcular");
           return;
       } else {
           menor = array1[0];
           maior = array1[0];
           for (int i = 0; i < array1.length; i++) {
               if (array1[i] < menor) {
                   menor = array1[i];
               }
               if (array1[i] > maior) {
                   maior = array1[i];
               }
           }
       }
        System.out.println(menor + " " + maior);

       if (array1.length == 1) {
           System.out.println("Não é possível calcular com apenas 1 número");
       } else {
           System.out.println((maior + menor));
       }
    }
}
