package com.devinhouse.ex04;

import java.util.StringTokenizer;

public class Contador2 {
    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public String contarPalavras() {
        String contador = String.valueOf(frase.split(" ").length);
        return contador;
    }
}
