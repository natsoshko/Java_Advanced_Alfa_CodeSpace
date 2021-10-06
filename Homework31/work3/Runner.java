package com.alfabank.work3;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Runner {
    public void run(String[] parameters) throws IOException {
        String old_copy = "Read.txt";
        String new_copy = "Read_new.txt";
        System.out.println("Copy file ...");
        copyFile(old_copy, new_copy);
        System.out.println("Copy ended.");
        replacementInFile(parameters[0]);
    }

    private void copyFile(String old_copy, String new_copy) throws IOException {
        String patch = "d:\\Alfa\\Alfa_CodeSpace\\Java_Advanced\\Homeworks\\PracticalWork31\\";
        Path oldFile = Paths.get(patch + old_copy);
        Path newFile = Paths.get(patch + new_copy);
        Files.copy(oldFile, newFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private void replacementInFile(String file) throws IOException {
        if(!file.endsWith("java")) {
            System.out.println("It`s a not Java programm");
            return;
        }

        Path path = Paths.get(file);
        System.out.println("Start replace");
        List<String> lines = Files.readAllLines(path);
        String tmpFile = file.substring(0, file.lastIndexOf("\\")+1) + "tmp.java";
        Path pathTmp = Paths.get(tmpFile);

        try(BufferedWriter buffer = Files.newBufferedWriter(pathTmp)) {
            for (String lin : lines) {
                buffer.write(lin.replace("public", "protected") + "\n");
            }
        }

//        Files.delete(path);
        Files.move(pathTmp, path, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("End replace");
    }

}