package tech.devinhouse.excecoes;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteExcecoes {
    public static void main(String[] args) throws IOException  {
       // testarUnchecked();
       // testarChecked();

        try {
            testarChecked();
        } catch (GarfieldException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void testarUnchecked() {
        // exceções não checadas
        try {
            String nada = null;
            nada.toUpperCase();
        } catch (NullPointerException e) {
            System.out.printf("Deu null pointer exception");
        }
     //   int a = 7, b = 0;
     //  int c = a / b;
    }
    private static void testarChecked() {
        Path path = Paths.get("arquivotestes.txt");
        try {
            Files.createFile(path);
        } catch(FileNotFoundException | FileAlreadyExistsException e) {
            System.out.printf("arquivo não existe");
        } catch (IOException e) {
            System.out.println("Deu IOException");
        }
    }

    public static void testeExcecao()  throws GarfieldException{
        System.out.println("Dentro do teste da exceção");
        throw new GarfieldException();
    }
}
