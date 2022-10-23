package tech.devinhouse.ex01;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setSaldo(1000.0);
        System.out.println(conta.getSaldo());

        conta.depositar(250.0);

        System.out.println( conta.obterSaldoAtual());
    }
}
