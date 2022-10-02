package com.devinhouse.exmegasena;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Megasena {
    private List<Concurso> concursos;

    public Megasena(List<Concurso> concursos) {
        this.concursos = concursos;
    }

    // Exercício 05 - imprimir dados preenchidos da classe Concurso
    public void imprimir() {
        for (Concurso conc : concursos) {
            System.out.println(conc);
        }
    }

    // Exercício 06 - imprimir os números do sorteio em forma crescente
    public void imprimirEmOrdemCrescente() {
        for (Concurso conc : concursos) {
            System.out.println(conc.formatarNumerosSorteadosOrdenados());
        }
    }

    // Exercício 07 - imprimir o número do sorteio em ordem crescente
    public void numConcursoEmOrdemCrescente() {
        Collections.sort(concursos);
        for (Concurso concurso: concursos) {
            System.out.println(concurso);
        }
    }

    // Exercicio 08 - verificar se houve sorteio na data inserida por input
    public void verificarDataSorteio() {
        System.out.println("Informe a data no formato dia/mês/ano");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPesquisa = LocalDate.parse(input, fmt);
        int[] sorteadosNaData = null;
        for (Concurso concurso : concursos) {
            if (concurso.getData().equals(dataPesquisa)) {
                // Se a data da pesquisa for igual a data de algum sorteio joga os números do sorteio no array sorteadosNaData
                sorteadosNaData = concurso.getSorteados();
                break;
            }
        }
        if (sorteadosNaData == null) {
            // Se não conter sorteio no dia o array dos números sorteados continua vazio
            System.out.println("Não houve sorteio no dia");
        } else {
            System.out.println(Arrays.toString(sorteadosNaData));
        }
    }

    // Exercício 09 - verificar se números inseridos já foram sorteados
    public void verificarSeNumerosForamSorteados() {
        System.out.print("Digite as 6 dezenas separadas por vírgulas: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(",");
        int[] numeros = {
                Integer.parseInt(split[0].trim()), Integer.parseInt(split[1].trim()),
                Integer.parseInt(split[2].trim()), Integer.parseInt(split[3].trim()),
                Integer.parseInt(split[4].trim()), Integer.parseInt(split[5].trim())
        };
        List<Integer> listaNumeros = ConversorArraysToList.converterOrdenado(numeros); // converte o array pra list
        int[] dezenasSorteadas = null;
        Integer numDoConcurso = null;
        for (Concurso concurso : concursos) {
            List<Integer> numOrdenado = ConversorArraysToList.converterOrdenado(concurso.getSorteados());
            if (numOrdenado.toString().equals(listaNumeros.toString())) { // se números inseridos forem iguais aos existentas ->
                dezenasSorteadas = concurso.getSorteados(); // insere numeros sorteados existentas no array
                numDoConcurso = concurso.getNumero(); // insere o número do concurso na variável
                break; // para se encontrar 1 jogo igual ao inserido
            }
        }
        if (dezenasSorteadas == null) {
            System.out.println("Números nunca sorteados");
        } else {
            System.out.println("Dezenas sorteadas no concurso: " + numDoConcurso);
            System.out.println(Arrays.toString(dezenasSorteadas));
        }
    }

    // Exercício 10 - Verificar qual números foram mais e menos vezes sorteeados
    public void numerosFrequentes() {
        Map<Integer, Integer> map = new HashMap<>();
        for (Concurso concurso : concursos) {
            int[] sorteados = concurso.getSorteados(); // array sorteados recebe os números dos resultados
            for (int i = 0; i < sorteados.length; i++) {
                int num = sorteados[i]; // num recebe a dezena sorteada na posição i começando em 0
                //System.out.println(num);
                int qtdAtual = map.getOrDefault(num, 0);
                map.put(num, qtdAtual + 1);
            }
        }
        int numMaisFrequente = 1;
        int numMenosFrequente = 1;
        int qtdMaisFrequente = 0;
        int qtdMenosFrequente = Integer.MAX_VALUE;

        for (Integer num: map.keySet()) {
            Integer qtd = map.get(num);
            if (qtd > qtdMaisFrequente) {
                qtdMaisFrequente = num;
                numMaisFrequente = num;
            }
            if (qtd < qtdMenosFrequente) {
                qtdMenosFrequente = qtd;
                numMenosFrequente = num;
            }
        }
        System.out.println("Número mais frequente = " + numMaisFrequente);
        System.out.println("Número menos frequente = " + numMenosFrequente);
    }

    // Exercício 11 - Exibir qual número está há mais tempo sem ser sorteado
    public void imprimirNumMaisAtrasado() {
        // Cria map de números sorteados e suas respectivas datas de sorteio
        Map<Integer, LocalDate> map = new HashMap<>();
        for (Concurso concurso : concursos) {
            int[] sorteados = concurso.getSorteados();
            for (int i = 0; i < sorteados.length; i++) {
                int num = sorteados[i];
                if (map.containsKey(num)) {
                    LocalDate dataUltSorteio = map.get(num);
                    if (concurso.getData().isAfter(dataUltSorteio)) {
                        map.put(num, concurso.getData());
                    }
                } else {
                    map.put(num, concurso.getData());
                }
            }
        }
        LocalDate dataMaisAntiga = LocalDate.now();
        int numMaisAtrasado = 0;
        for (Integer num : map.keySet()) {
            LocalDate data = map.get(num);
            if (data.isBefore(dataMaisAntiga)) { // se data é antes de dataMaisAntiga
                dataMaisAntiga = data; // dataMaisAntiga recebe data
                numMaisAtrasado = num;
            }
        }
        System.out.println("Número mais atrasado = " + numMaisAtrasado);
    }
}
