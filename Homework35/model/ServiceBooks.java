package com.alfabank.model;

import com.alfabank.model.entity.Book;
import java.util.List;
import java.util.ArrayList;

public class ServiceBooks {
    private List<Book> books;

    public ServiceBooks() {
        this.books = SourceBooks.getBooks();
    }

    public List<String> getAllBooks() {
        return ConverterBooks.convert(books);
    }

    public void addBook(String param1, String param2, String param3, int param4, int param5, double param6) {
        books.add(new Book(param1, param2, param3, param4, param5, param6));
    }

    public void editCostBook(int indexBook, int ipercent, String sAction) {
        if (sAction.equals("increase")) {
            books.get(indexBook).setCost(books.get(indexBook).getCost() + books.get(indexBook).getCost() * ipercent / 100);
        } else if (sAction.equals("decrease")) {
            books.get(indexBook).setCost(books.get(indexBook).getCost() - books.get(indexBook).getCost() * ipercent / 100);
        }
    }

    public List <Book> searchByAuthor(String findAuthor) {
        List <Book> arrAuth = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().equals(findAuthor.toLowerCase())) {
                arrAuth.add(book);
            }
        }
        return arrAuth;
    }

    public List <Book> searchByPublisher(String findPublish) {
        List <Book> arrPub = new ArrayList<>();
        for (Book book : books) {
            if (book.getPulisher().toLowerCase().equals(findPublish.toLowerCase())) {
                arrPub.add(book);
            }
        }
        return arrPub;
    }

    public List <Book> searchByYear(int findYear) {
        List <Book> arrYears = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= findYear) {
                arrYears.add(book);
            }
        }
        return arrYears;
    }

}
