package com.devinhouse.exmegasena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConversorArraysToList {

    public  static List<Integer> converter(int[] arr) {
        List<Integer> lista = new ArrayList<>();
        for (int nro : arr) {
            lista.add(nro);
        }
        return lista;
    }


    public static List<Integer> converterOrdenado(int[] arr) {
        List<Integer> convertido = converter(arr); // Converte o array "arr" para lista
        Collections.sort(convertido); // Collections só pode ser utilizado em lista
        return convertido; // retorna a lista convertida com Collections.sort que ordena a lista de crescente
    }
}
