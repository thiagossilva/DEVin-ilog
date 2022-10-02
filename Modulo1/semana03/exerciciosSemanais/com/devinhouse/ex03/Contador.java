package com.devinhouse.ex03;

import java.util.StringTokenizer;

public class Contador {
    public static void contarPalavras(String frase) {
        int qtdPalavras = frase.split(" ").length;
        System.out.println("Quantidade de palavras = " + qtdPalavras);
    }
}
