package tech.devinhouse.heranca;

public abstract class Animal {
    protected String nome;

    protected int idade;




    protected abstract String emitirSom();

    protected String TomarBanho() {
        return "Tomei banho";
    }
}
