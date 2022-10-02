package tech.devinhouse.repository;

import tech.devinhouse.models.Tarefa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ArquivoRepository {
    public static void gerar(String nomeArquivo, List<Tarefa> lista) throws IOException {
        Path path = Paths.get(nomeArquivo);
        Files.deleteIfExists(path);
        Files.createFile(path);
        for (Tarefa tarefa : lista) {
            String linha = tarefa.toString() + "\n";
            Files.writeString(path, linha, StandardOpenOption.APPEND);
        }
    }
}
