package tech.devinhouse.ex03;

public class Produto implements Tributavel{
    private Double valor;
    private Double valorImposto;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(Double valorImposto) {
        this.valorImposto = valorImposto;
    }

    @Override
    public Double calcularValorComImposto() {
        return this.valor + this.valorImposto;
    }
}
