package tech.devinhouse.interfaces;

public class TrabalhadorPresencial implements Trabalhador {
    @Override
    public void baterPonto() {
        System.out.println("Bateu ponto via biometria");
    }
}
