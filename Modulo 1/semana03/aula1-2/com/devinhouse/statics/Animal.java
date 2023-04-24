package com.devinhouse.statics;

public class Animal {
    public static int contador = 0;

    public static String valorEstatico = "animal";

    public String nome; // não estático

    public Animal(String nome) {
        this.nome = nome;
        contador++;
    }
}
