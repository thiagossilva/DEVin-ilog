package tech.devinhouse.heranca;

public class Zebra extends Animal{
    int quantidadeDeListras;

    public String zebrar() {
        return "zebrar";
    }

    @Override
    public String emitirSom() {
        return "auuuu";
    }
}
