package com.alfabank.work4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Runner {
    public void run(String[] parameters) throws IOException {
        AccountingUser aUser = new AccountingUser();
        aUser.addUsers("Sidorov");
        aUser.addUsers("Ivanov");
        aUser.addUsers("Onashko");
        aUser.addUsers("Petrov");
        aUser.addUsers("Ivanov");
        aUser.finalize();
        aUser.printFile();

    }

    public class AccountingUser {
        private String path = "d:\\Alfa\\Alfa_CodeSpace\\Java_Advanced\\Homeworks\\PracticalWork31\\users.txt";
        private RandomAccessFile file;

        public AccountingUser () throws FileNotFoundException {
            this.file = new RandomAccessFile(path, "rw");
        }
        public void addUsers(String nameUser) throws IOException {
            file.seek(0);
            String line;
            long pointer = 0;
            while ((line = file.readLine()) != null) {
                String [] sCurLine = line.replaceAll("\\s+", "").split(":");
                if (sCurLine[0].equalsIgnoreCase(nameUser)) {
                    int iCount = Integer.parseInt(sCurLine[1]);
                    iCount++;
                    file.seek(pointer);
                    file.writeBytes(line.replace(sCurLine[1], Integer.toString(iCount)));
                    return;
                }
                pointer = file.getFilePointer();
            }
            String sBuff = "\n" + nameUser + ":1";
            file.writeBytes(sBuff);

        }

        protected void finalize() throws IOException {
            file.close();
        }

        public void printFile() throws IOException {
            file = new RandomAccessFile(path, "r");
            String line2;
            while ((line2 = file.readLine()) != null) {
                System.out.println(line2);
            }
            finalize();
        }

    }
}
