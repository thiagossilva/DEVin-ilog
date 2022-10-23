package tech.devinhouse.ex0102.models;

import lombok.*;

@Data
@Builder
public class Pet {

    private static int sequencia = 0;
//    @Getter(AccessLevel.NONE)
//    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private String alimentoPreferido;

    public Pet() {
        this.id = generateId();
    }

    public Pet(Integer id, String nome, String tipo, String raca, Integer idade, String alimentoPreferido) {
        this.id = generateId();
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.alimentoPreferido = alimentoPreferido;
    }

    private Integer generateId() {
        return ++sequencia;
    }
}
