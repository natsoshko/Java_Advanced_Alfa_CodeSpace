package com.alfabank.work21;
import java.util.Scanner;

public class Runner {
    public void run() {
        Book book1 = new Book();
            //1-1
//        System.out.println(book1);
//        System.out.println(book1.getId() + " "
//        + book1.getAuthor() + " "
//        + book1.getTitle() + " "
//        + book1.getPulisher() + " "
//        + book1.getYear() + " "
//        + book1.getPage() + " "
//        + book1.getCost());

            //1-2
//        book1.view();
//        book1.setId(1);
//        book1.setAuthor("Kelby");
//        book1.setYear(2021);
//        book1.setCost(150.5);
//        book1.view();

        //1-3
        book1.view();
        Book book2 = new Book("Elon Musk");
        book2.view();
        Book book3 = new Book(3, "Andriy Shevchenko", "Forza gentile","Baldini+Castoldi", 2021, 226, 340);
        book3.view();
        System.out.println();

        //1-4
        Book [] booksArr = arrBooks();
        showBooks(booksArr);
        System.out.println();
        System.out.println("Enter percent value: ");
        Scanner sc1 = new Scanner(System.in);
        int iPer = sc1.nextInt();
        System.out.println("Cost was increased on 10%:");
        increaseCostBooks(booksArr, iPer);
        showBooks(booksArr);
        //1-5
        System.out.println();
        System.out.println("Enter Author: ");
        Scanner sc2 = new Scanner(System.in);
        String sAuth = sc2.nextLine();
        searchByAuthor(booksArr, sAuth);

        System.out.println();
        System.out.println("Enter Publisher: ");
        Scanner sc3 = new Scanner(System.in);
        String sPubl = sc2.nextLine();
        searchByPublisher(booksArr, sPubl);

        System.out.println();
        System.out.println("Enter year: ");
        Scanner sc4 = new Scanner(System.in);
        int iYear = sc4.nextInt();
        searchByYear(booksArr, iYear);

    }
        //1-4
    public Book [] arrBooks() {
        Book [] books = {
                new Book(1, "Shevchenko", "Forza gentile","Baldini+Castoldi", 2021, 226, 340),
                new Book(2, "Kelby", "Digital Photography", "Rocky Nook", 2020, 272, 1280),
                new Book(3, "Vance", "Elon Musk", "Penguin", 2020, 80, 235),
                new Book(4, "McConaughey", "Greenlights", "Headline Publishing Group", 2020, 304, 780),
                new Book(5, "Кіпіані", "Справа Василя Стуса", "Vivat", 2019, 688, 260),
                new Book(6, "Мартін", "Чистий AGILE", "Фабула", 2021, 224, 380),
                new Book(7, "Horstmann", "Core Java Volume I-Fundamentals", "Pearson", 2020, 864, 1400),
                new Book(8, "Kelby", "Adobe Photoshop", "Rocky Nook", 2021, 346, 1150),
        };
        return books;
    }

    public void showBooks(Book [] arrBooks1) {
        for (Book bks: arrBooks1) {
            System.out.println(bks.getId() + " "
                    + bks.getAuthor() + " "
                    + bks.getTitle() + " "
                    + bks.getPublisher() + " "
                    + bks.getYear() + " "
                    + bks.getPage() + " "
                    + bks.getCost());
        }
    }

    public void increaseCostBooks(Book [] arrBooks2, int per) {
        for (Book bks: arrBooks2) {
            bks.setCost((bks.getCost() + bks.getCost()*per/100));
        }
    }
        //1-5
    public void searchByAuthor(Book [] arrBooks3, String auth) {
        boolean bSearch = false;
        for (Book bks: arrBooks3) {
            if (bks.getAuthor().equals(auth)) {
                bSearch = true;
                System.out.println(bks.getId() + " "
                        + bks.getAuthor() + " "
                        + bks.getTitle() + " "
                        + bks.getPublisher() + " "
                        + bks.getYear() + " "
                        + bks.getPage() + " "
                        + bks.getCost());
            }
        }
        if (!bSearch) {
            System.out.println("Books doesn't found by this author: " + auth);
        }
    }

    public void searchByPublisher(Book [] arrBooks4, String publ) {
        boolean bSearch = false;
        for (Book bks: arrBooks4) {
            if (bks.getPublisher().equals(publ)) {
                bSearch = true;
                System.out.println(bks.getId() + " "
                        + bks.getAuthor() + " "
                        + bks.getTitle() + " "
                        + bks.getPublisher() + " "
                        + bks.getYear() + " "
                        + bks.getPage() + " "
                        + bks.getCost());
            }
        }
        if (!bSearch) {
            System.out.println("Books doesn't found by this publisher: " + publ);
        }
    }

    public void searchByYear(Book [] arrBooks5, int iyr) {
        boolean bSearch = false;
        for (Book bks: arrBooks5) {
            if (bks.getYear() > iyr) {
                bSearch = true;
                System.out.println(bks.getId() + " "
                        + bks.getAuthor() + " "
                        + bks.getTitle() + " "
                        + bks.getPublisher() + " "
                        + bks.getYear() + " "
                        + bks.getPage() + " "
                        + bks.getCost());
            }
        }
        if (!bSearch) {
            System.out.println("Books doesn't found after this year: " + iyr);
        }
    }

}
