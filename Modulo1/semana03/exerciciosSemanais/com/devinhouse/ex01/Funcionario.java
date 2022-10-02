package com.devinhouse.ex01;

public class Funcionario {
    private String nomeCompleto;
    private String CPF;
    private Float salario;


    @Override
    public String toString() {
        return "Funcionario{" +
                "nomeCompleto= '" + nomeCompleto + '\'' +
                ", CPF= '" + CPF + '\'' +
                ", salario= " + salario +
                '}';
    }

    public float promover(float porcento) {
        return this.salario * porcento / 100;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
