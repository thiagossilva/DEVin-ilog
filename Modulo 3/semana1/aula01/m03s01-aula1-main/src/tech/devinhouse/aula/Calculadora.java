package tech.devinhouse.aula;

public class Calculadora {

    public Float calcular(Float valor1, Float valor2, Operacao operacao) {
        Float resultado = null;
        switch (operacao) {
            case SOMA:
                resultado = valor1 + valor2;
                break;
            case SUBTRACAO:
                resultado = valor1 - valor2;
                break;
            case MULTIPLICACAO:
                resultado = valor1 * valor2;
                break;
            case DIVISAO:
                resultado = valor1 / valor2;
                break;
        }
        return resultado;
    }

}
