package tech.devinhouse.server.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PessoaRequest {

    @NotEmpty(message = "Nome é campo obrigatório")
    private String nome;

    @NotNull(message = "Idade é campo obrigatório")
    private Integer idade;

}
