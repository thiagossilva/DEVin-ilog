package tech.devinhouse.lambdas;

import tech.devinhouse.comparacoes.Gato;
import tech.devinhouse.funcionarios.Autenticavel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaLambda {
    public static void main(String[] args) {
        Autenticavel aut = ((nome, senha) -> nome.equals(senha)); // lambda comparando se nome é igual a senha

        Gato garfield = new Gato("Garfield", 5);
        Gato tom = new Gato("Tom", 9);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(tom);
        gatos.add(garfield);

        System.out.println(gatos);

        Comparator<Gato> idadeComparator = (g1, g2) -> g1.getIdade().compareTo(g2.getIdade());

        Collections.sort(gatos, idadeComparator); // compara gatos sorteando pela idade em ordem crescente
        System.out.println("Gatos ordenados pela idade " + gatos);

        gatos.stream()
                .sorted(Comparator.comparing(Gato::getNome)
                        .thenComparing(Gato::getIdade));

    }
}
