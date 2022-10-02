package com.devinhouse.praticas.sorteiraNum;

public class LogicaJogo {
    private final int min;
    private final int max;
    private final int sorteado;

    public LogicaJogo(int min, int max, int sorteado) {
        this.min = min;
        this.max = max;
        this.sorteado = sorteado;
    }

    public void ImprimirSaudacao() {
        System.out.println("Bem vindo!");
        System.out.println("Você terá que adivinhar o número escolhido");
        System.out.printf("O número é entre %d e %d", min, max);

    }
}
