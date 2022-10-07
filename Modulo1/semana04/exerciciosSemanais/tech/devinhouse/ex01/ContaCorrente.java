package tech.devinhouse.ex01;

public class ContaCorrente extends Conta implements Operavel{
    @Override
    public void depositar(Double valor) {
        System.out.println(obterSaldoAtual() + valor);
    }

    @Override
    public void sacar(Double valor) {
        System.out.println(obterSaldoAtual() - valor);
    }
}
