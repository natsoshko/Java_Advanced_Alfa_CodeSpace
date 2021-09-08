package com.alfabank.work3;
import java.util.Scanner;

public class Runner {
    public void run() {
        MyTranslator vocab = new MyTranslator();
        vocab.addWords("photography", "фотографія");
        vocab.addWords("art", "мистецтво");
        vocab.addWords("school", "школа");
        vocab.addWords("is", "є");
        vocab.addWords("book", "книга");

        System.out.println("Input english text: ");     //photography is art
        Scanner sc = new Scanner(System.in);
        String sTextEng = sc.nextLine();
        String sTextUkr = vocab.translate(sTextEng);
        System.out.println("Eng -> Ukr: " + sTextUkr);
    }
}
