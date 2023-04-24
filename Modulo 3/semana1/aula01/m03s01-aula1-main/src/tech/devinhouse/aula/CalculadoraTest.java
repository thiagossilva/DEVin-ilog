package tech.devinhouse.aula;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste da Calculadora")
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeAll
    static void setupAll() {
        System.out.println("Executado uma unica vez no inicio da classe de teste");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Executado uma unica vez no encerramento da classe de teste");
    }

    @BeforeEach
    void setup() {
        System.out.println("Antes de cada metodo de teste");
        calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Depois de cada metodo de teste");
    }

    @Test
    @DisplayName("Quando operacao de soma de dois nros positivos, deve retornar um nro positivo")
//    @Order(1)
    void calcular_soma() {
        Float resultado = calculadora.calcular(2.1f, 3.5f, Operacao.SOMA);
        assertNotNull(resultado);
        assertEquals(5.6f, resultado);
    }

    @Test
    @DisplayName("Quando operacao de soma de dois nros negativos, deve retornar um nro negativo")
//    @Order(2)
    void calcular_soma_erro1() {
        Float resultado = calculadora.calcular(-2.1f, -3.5f, Operacao.SOMA);
        assertNotNull(resultado);
        assertEquals(-5.6f, resultado);
    }

    @Test
    @DisplayName("Quando operacao de subtracao de dois numeros positivos com primeiro maior, deve retornar um nro positivo")
//    @Order(3)
    void calcular_subtracao() {
        Float resultado = calculadora.calcular(5f, 3.5f, Operacao.SUBTRACAO);
        assertNotNull(resultado);
        assertTrue(resultado >= 0);
        assertEquals(1.5f, resultado);
    }

    @Test
    @DisplayName("Quando operacao de subtracao de dois numeros positivos com primeiro menor, deve retornar um nro negativo")
//    @Order(4)
    void calcular_subtracao2() {
        Float resultado = calculadora.calcular(3.5f, 5f, Operacao.SUBTRACAO);
        assertNotNull(resultado);
        assertFalse(resultado >= 0);
        assertEquals(-1.5f, resultado);
    }

}