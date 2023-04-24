package tech.devinhouse.m01s06sevrvlet.model;

public class Pessoa {
    private static Integer sequencia = 0;
    private String nome;
    private Integer id;
    private Integer idade;

    public Pessoa() {
        this.id = recebeid();
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", idade=" + idade +
                '}';
    }

    private Integer recebeid() {
        return ++sequencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }



    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
