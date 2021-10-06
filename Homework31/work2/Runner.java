package com.alfabank.work2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Runner {
    public void run(String[] parameters) throws IOException {
        if (parameters.length < 1) {
            printFile(".\\src\\com\\alfabank\\work2\\Runner.java");
        } else if ( !Files.isDirectory(Paths.get(parameters[0]))) {
            printFileNio(parameters[0]);
        }
    }

    public void printFile(String name) throws IOException {
        String line;
        File file = new File(name);
        try(BufferedReader fileText = new BufferedReader(new FileReader(file))) {
            while ((line = fileText.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void printFileNio(String name) throws IOException {
        String line;
        Path path = Paths.get(name);
        List<String> lines = Files.readAllLines(path);
        for (String lin:lines) {
            System.out.println(lin);
        }

    }
}