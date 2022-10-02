import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ArquivosNID {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivo.txt");
        Path path2 = Paths.get("arquivo.txt");
        Path dir = Paths.get("diretorio");

        Path diretorioEarquivo = dir.resolve(path);

        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        if (Files.notExists(path2)) {
            Files.createFile(path2);
        }

        List<String> nomes = List.of("Thiago", "Ana", "Luiz", "Vanuza");
        for (String nome : nomes) {
            nome = nome +  "\n";
            Files.writeString(path, nome, StandardOpenOption.APPEND);
//            Files.write(path2, nome.getBytes(), StandardOpenOption.APPEND);
        }
        List<String> nomes2 = List.of("Simone", "Jhin", "Lui", "Zeca");
        for (String nome: nomes2) {
            nome = nome + "\n"; // \n quebra a linha
            Files.writeString(path2, nome, StandardOpenOption.APPEND);
//            Files.write(path2, nome.getBytes(), StandardOpenOption.APPEND);
        }

        // Ler arquivos
        List<String> lerPath1 = Files.readAllLines(path);
        List<String> lerPath2 = Files.readAllLines(path2);

        System.out.println(lerPath1);
        System.out.println(lerPath2);

    }
}
