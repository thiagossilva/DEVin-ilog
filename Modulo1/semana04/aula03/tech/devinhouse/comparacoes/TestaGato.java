package tech.devinhouse.comparacoes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaGato {
    public static void main(String[] args) {
        Gato gatito = new Gato("Tom", 4);
        Gato gatao = new Gato("Frajola", 9);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(gatito);
        gatos.add(gatao);

        Collections.sort(gatos);
        System.out.println(gatos);
    }
}
