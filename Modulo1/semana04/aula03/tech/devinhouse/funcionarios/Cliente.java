package tech.devinhouse.funcionarios;

public class Cliente implements Autenticavel{
    @Override
    public boolean autenticar(String nome, String senha) {
        return true;
    }
}
