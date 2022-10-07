package tech.devinhouse.funcionarios;

public class Teste {
    public static void main(String[] args) {
        Funcionario func = new Diretor();

        String resultado = func.baterPonto();

        System.out.println(resultado);
    }
}
