package tech.devinhouse.ex0306.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {

    //    @Getter(AccessLevel.NONE)
//    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private String alimentoPreferido;
    private Tutor tutor;


}

