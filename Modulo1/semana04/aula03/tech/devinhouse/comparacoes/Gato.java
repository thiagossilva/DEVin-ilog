package tech.devinhouse.comparacoes;

import java.time.LocalDate;

public class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private LocalDate dataCadastro;


    public Gato(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        // dataCadastro será sempre a atual, então n precisa estar no construtor
        this.dataCadastro = LocalDate.now();
    }

    @Override
    public String toString() {
        return "nome= '" + nome + '\'' +
                ", idade= " + idade +
                ", dataCadastro= " + dataCadastro;
    }

    @Override
    public int compareTo(Gato other) {
        return this.nome.compareTo(other.nome);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = LocalDate.now();
    }
}
