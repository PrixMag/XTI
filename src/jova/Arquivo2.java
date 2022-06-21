package jova;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/XTI/files/texto.txt");
        Charset utf8 = StandardCharsets.UTF_8;


        // Escrita de arquivos
        try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
            w.write("Outro texto\n");
            w.write("Mais um texto\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leitura de arquivos
        try (BufferedReader r = Files.newBufferedReader(path, utf8)) {
            String line = null;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}