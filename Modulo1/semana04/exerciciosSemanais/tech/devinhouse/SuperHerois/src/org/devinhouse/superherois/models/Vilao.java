package org.devinhouse.superherois.models;

public class Vilao extends Personagem {
    Integer tempoDePrisao;
    public Vilao(String nome, String superpoder, Integer tempoDePrisao) {
        super(nome, superpoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "tempoDePrisao=" + tempoDePrisao +
                ", nome='" + nome + '\'' +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }
}
