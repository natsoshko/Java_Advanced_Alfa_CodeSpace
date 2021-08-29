package com.alfabank.work12;

public class Runner {
    public void run() {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        System.out.println(myPhoneBook.printPhoneBook());
        myPhoneBook.addPhoneNumber("Ivan", "0971234567");
        myPhoneBook.addPhoneNumber("Mariia", "0689876543");
        myPhoneBook.addPhoneNumber("Ievgen", "0501827345");
        myPhoneBook.addPhoneNumber("Svilana", "0975643287");
        System.out.println(myPhoneBook.printPhoneBook());
        System.out.println("--- sortByName ---");
        System.out.println(myPhoneBook.sortByName());
        System.out.println("--- sortByPhoneNumber ---");
        System.out.println(myPhoneBook.sortByPhoneNumber());
    }
}
