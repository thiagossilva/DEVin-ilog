package tech.devinhouse.funcionarios;



public class Diretor extends Funcionario implements Autenticavel {
    @Override
    public String obterCategoria() {
        return "Sou diretor";
    }

    @Override
    public boolean autenticar(String nome, String senha) {
        if (nome.equals("Diretor") && senha.equals("1234")) {
            return true;
        }
        return false;
    }
}
