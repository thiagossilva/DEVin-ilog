package com.devinhouse.desafios;

public class CalculadoraGorjetas {
    private Double conta;
    private Double gorjeta;


    public double calcularGorjeta() {
        return conta * (gorjeta/100);
    }

    public Double getConta() {
        return conta;
    }

    public void setConta(Double conta) {
        this.conta = conta;
    }

    public Double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(Double gorjeta) {
        this.gorjeta = gorjeta;
    }
}
