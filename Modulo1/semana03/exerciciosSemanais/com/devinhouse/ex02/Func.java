package com.devinhouse.ex02;

public class Func {
    private String nome;
    private float salario;

    public Func(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Func(String nome) {
        this.nome = nome;
    }

    public float aumentar(float valor) {
        return this.salario + valor;
    }

    public float aumentar(float valor, float comissao) {
        return this.salario + valor + comissao;
    }
}
