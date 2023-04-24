package orientacaoobjetos;

public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 1000;

        Cliente cliente = new Cliente();
        cliente.nome = "Thiago";
        cliente.sobremnome = "Sousa";
        cliente.cpf = 12345678901l;

        conta.titular = cliente;

        System.out.println(cliente);
    }
}

