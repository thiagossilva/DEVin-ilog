package tech.devinhouse.exercicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FolhaDePagamentoTest {

    private FolhaDePagamento folha;

    @BeforeEach
    void setup() {
        folha = new FolhaDePagamento();
    }

    @Test
    @DisplayName("Quando tem gratificacao, deve adicionar gratificacao no salario")
    void calcularSalarioBruto_comGratificacao() {
        // given
        Double salarioBase = 1000.0;
        Double gratificacao = 200.0;
        String funcao = "dev";
        // when
        Double resultado = folha.calcularSalarioBruto(salarioBase, gratificacao, funcao);
        // then
        assertNotNull(resultado);
        assertEquals(1200.0, resultado);
    }

    @Test
    @DisplayName("Quando nao tem gratificacao, nao deve adicionar gratificacao no salario")
    void calcularSalarioBruto_semGratificacao() {
        // given
        Double salarioBase = 1000.0;
        Double gratificacao = null;
        String funcao = "dev";
        // when
        Double resultado = folha.calcularSalarioBruto(salarioBase, gratificacao, funcao);
        // then
        assertNotNull(resultado);
        assertEquals(1000.0, resultado);
    }

    @Test
    @DisplayName("Quando é gerente, não deve adicionar percentual no salário")
    void calcularSalarioBruto_ehGerente() {
        //TODO: IMPLEMENTAR !!!
    }

    // ... CONTINUAR...

    @Test
    void calcularSalarioLiquido() {
        Double salario = 100.0;
        List<Double> descontos = new ArrayList<>();
        descontos.add(200.0);
        assertThrows(IllegalStateException.class, () -> folha.calcularSalarioLiquido(salario, descontos));
    }

}