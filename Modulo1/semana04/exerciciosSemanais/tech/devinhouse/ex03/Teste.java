package tech.devinhouse.ex03;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setValor(500.0);
        produto.setValorImposto(100.0);
        System.out.println(produto.calcularValorComImposto());
    }
}
