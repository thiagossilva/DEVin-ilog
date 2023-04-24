package tech.devinhouse.heranca;

public class Teste {
    public static void main(String[] args) {
        Zebra zebra = new Zebra();
        zebra.nome = "Marvin";
        zebra.quantidadeDeListras = 5;

       // zebra.setNome("Marvin");
        //System.out.println(zebra.getNome());
        System.out.println(zebra.zebrar());


        Gato gato = new Gato();
        gato.nome = "gato de botas";
        gato.pelo = "cinza";
    }


}
