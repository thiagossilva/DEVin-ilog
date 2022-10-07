package tech.devinhouse.excecoes;

public class GarfieldException extends Exception{
    public GarfieldException() {
        super("Garfield lançou exceção");
    }

    public GarfieldException(String valor) {
        super("Garfield viu o valor: " + valor);
    }
}
