package tech.devinhouse.ex0306.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tutor {

    //    @Getter(AccessLevel.NONE)
//    @Setter(AccessLevel.NONE)
    private Integer id;
    private Integer idade;
    private String nome;
}