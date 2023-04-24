package org.devinhouse.superherois.models;

import java.util.Comparator;
import java.util.Objects;

public abstract class Personagem implements Comparable<Personagem>{
    String nome;
    String superpoder;



    public Personagem(String nome, String superpoder) {
        this.nome = nome;
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }

    @Override
    public int compareTo(Personagem o) {
        // compara o nome do personagem com ele mesmo
        // retorna 0 se forem iguais
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // se o for igual a ele mesmo retorna true
        if (o == null || getClass() != o.getClass()) return false; // se o for null ou a classe for diferente da classe se o
        Personagem that = (Personagem) o; // força o "o" a entrar na classe "Personagem"
        return nome.equals(that.nome); // retorna o nome comparado ao da variavel that
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }



}
