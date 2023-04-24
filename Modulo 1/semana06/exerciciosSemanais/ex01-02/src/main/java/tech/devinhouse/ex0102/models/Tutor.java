package tech.devinhouse.ex0102.models;

import lombok.*;

@Data
@Builder
public class Tutor {
    private static int sequencia = 0;
//    @Getter(AccessLevel.NONE)
//    @Setter(AccessLevel.NONE)
    private Integer id;
    private Integer idade;
    private String nome;

    public Tutor() {
        this.id = generateId();
    }

    public Tutor(Integer id, Integer idade, String nome) {
        this.id = generateId();
        this.idade = idade;
        this.nome = nome;
    }

    private Integer generateId() {
        return ++sequencia;
    }
}
