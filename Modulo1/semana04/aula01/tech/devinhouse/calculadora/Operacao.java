package tech.devinhouse.calculadora;

public interface Operacao {
    double num = 0;
    String retorno = null;
    double calcular(double num1, double num2);


    String getDescricao();
}
