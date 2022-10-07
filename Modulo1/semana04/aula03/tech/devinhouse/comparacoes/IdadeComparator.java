package tech.devinhouse.comparacoes;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Gato> {
    @Override
    // cria comparador de idade dos gatos
    public int compare(Gato g1, Gato g2) {
        return g1.getIdade().compareTo(g2.getIdade());
    }
}
