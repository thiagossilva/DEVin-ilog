package tech.devinhouse.lambdas;

import tech.devinhouse.comparacoes.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        Gato frajola = new Gato("Frajola", 11);
        Gato jhin = new Gato("jhin", 2);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(frajola);
        gatos.add(jhin);

        Gato filtraPeloNome = null;
        for (Gato gato : gatos) {
            if (gato.getNome().equals("jhin"))
                filtraPeloNome = gato;
        }
        System.out.println(filtraPeloNome);

        List<Integer> gatos2 = gatos.stream()
                        .filter(gato -> gato.getNome()
                        .equals("jhin"))
                         .map(gato -> gato.getIdade())
                         .collect(Collectors.toList());
    }
}
