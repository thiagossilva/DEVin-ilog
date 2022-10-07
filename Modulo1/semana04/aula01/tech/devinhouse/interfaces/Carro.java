package tech.devinhouse.interfaces;

public interface Carro {
    void acelerar();
    default void frear() {
        System.out.println("Carro está freando");
    }
}
