package tech.devinhouse.ex01;

public abstract class Conta {
    private Double saldo;


    protected Double obterSaldoAtual() {
        return this.saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


}
