package com.devinhouse.exmegasena;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) throws IOException {
        List<String> lista = lerDoArquivo();
        List<Concurso> concursos = carregarConcursos(lista);
        Megasena megasena = new Megasena(concursos);

        //megasena.imprimir(); // exercício 05
        //megasena.imprimirEmOrdemCrescente(); // exercício 06
        //megasena.numConcursoEmOrdemCrescente(); // exercício 07
        //megasena.verificarDataSorteio(); // exercício 08
        //megasena.verificarSeNumerosForamSorteados(); // exercício 9
        megasena.numerosFrequentes(); // exercício 10
        //megasena.imprimirNumMaisAtrasado();



    }
    // Ler arquivos
    private static List<String> lerDoArquivo() throws IOException {
        Path path = Paths.get("C:\\Users\\thi_t\\Desktop\\DEVinHouse\\Modulos\\Modulo1\\semana03", "megasena.txt");
        List<String> lerMega = Files.readAllLines(path);
        return lerMega;
    }
    private static List<Concurso> carregarConcursos(List<String> lerMega) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ArrayList<Concurso> concursos = new ArrayList<>();
        for (String linhas : lerMega){
            String [] dados = linhas.split(",");
            Integer numero = Integer.valueOf(dados[0]);
            LocalDate data = LocalDate.parse(dados[1], fmt);

            int[] sorteados = new int[6];
            for (int i = 2; i <= 7; i++){
                sorteados[i-2] = Integer.parseInt(dados[i]);
            }

            // opção de uso ao invés do for
            // int sorteados[] = {Integer.parseInt(partes[2]... até a posição 7}
            Concurso concurso = new Concurso(numero, data, sorteados);
            concursos.add(concurso);

        }
        for (Concurso linhas : concursos) {
            System.out.println(linhas);
        }
        return concursos;
    }

}

