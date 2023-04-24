package tech.devinhouse.interfaces;

public class TrabalhadorHomeOffice implements Trabalhador, Comparable{
    @Override
    public void baterPonto() {
        System.out.println("Bateu ponto via sistema");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
