package tech.devinhouse.interfaces;

public class Uno implements Carro{

    @Override
    public void acelerar() {
        System.out.println("Uninho acelerando na velocidade da luz");
    }

    @Override
    public void frear() {
        System.out.println("Uninho freando");
    }
}
