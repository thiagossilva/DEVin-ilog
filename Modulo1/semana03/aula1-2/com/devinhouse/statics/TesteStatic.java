package com.devinhouse.statics;

public class TesteStatic {
    public static void main(String[] args) {
        Animal gato = new Animal("Jhin");
        Animal cachorro = new Animal("Lui");
        System.out.println(gato.nome);
        System.out.println(cachorro.nome);

        System.out.println(gato.contador);
    }


}
