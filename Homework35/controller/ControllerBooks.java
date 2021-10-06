package com.alfabank.controller;

import com.alfabank.model.ConverterBooks;
import com.alfabank.model.ServiceBooks;
import com.alfabank.model.entity.Book;
import com.alfabank.view.ViewBooks;
import com.alfabank.view.ViewConstants;

import java.util.ArrayList;
import java.util.List;

public class ControllerBooks {
    private ServiceBooks serviceBooks = new ServiceBooks();
    private ViewBooks viewBooks = new ViewBooks();

    public void execute() {
        while (true) {
            viewBooks.printMenu();
            String command = viewBooks.getCommand();
            switch (command) {
                case "view": viewBooks.printBooks(serviceBooks.getAllBooks()); break;
                case "add": proccessedAdd(); break;
                case "edit": processedEdit(); break;
                case "author": processedSearchAuthor(); break;
                case "publisher": break;
                case "year": break;
                case "exit": System.exit(1);
                default: viewBooks.printMessage(ViewConstants.ERROR);
            }
            viewBooks.printMessage(ViewConstants.SEPARATOR);
        }
    }

    private void proccessedAdd() {
        while (true) {
            String bookParams = viewBooks.getInfoBook();
            String[] params = bookParams.split(";");
            try {
                int year = Validator.checkYear(params[3]);
                int pages = Validator.checkPage(params[4]);
                double price = Validator.checkPrice(params[5]);
                serviceBooks.addBook(params[0], params[1], params[2], year, pages, price);
                break;
            } catch (IllegalArgumentException exp) {
                if (exp.getMessage().equals("ERROR_YEAR")) {
                    viewBooks.printMessage(ViewConstants.ERROR_YEAR);
                }
                if (exp.getMessage().equals("ERROR_PAGES")) {
                    viewBooks.printMessage(ViewConstants.ERROR_PAGES);
                }
                if (exp.getMessage().equals("ERROR_PRICE")) {
                    viewBooks.printMessage(ViewConstants.ERROR_PRICE);
                }
            }
        }
    }

    private void processedEdit() {
        int iCount = serviceBooks.getAllBooks().size();
        String sIdBook = viewBooks.getIdPercentBook();
        String[] params = sIdBook.split(";");
        try {
            int idBook = Validator.checkIdBook(params[0], iCount);
            int ipercent = Validator.checkPercent(params[1]);
            serviceBooks.editCostBook(idBook, ipercent, params[2]);
        } catch (IllegalArgumentException exp) {
            if (exp.getMessage().equals("ERROR_PERCENT")) {
                viewBooks.printMessage(ViewConstants.ERROR_PERCENT);
            }
            if (exp.getMessage().equals("ERROR_IDBOOK")) {
                viewBooks.printMessage(ViewConstants.ERROR_IDBOOK);
            }
        }
    }

    private void processedSearchAuthor() {
        String srcAuthor = viewBooks.getSearchAuthor();
        try {
            ArrayList<Book> arrSearchAuth = serviceBooks.searchAuthor(srcAuthor);
            Boolean bSize = false;
            bSize = Validator.checkSizeArrAuthor(arrSearchAuth);
            if (bSize) {
                viewBooks.printBooks(ConverterBooks.convert(arrSearchAuth));
            }
        } catch (NullPointerException exp) {
            viewBooks.printMessage(ViewConstants.ERROR_AUTHOR);
        }

    }
}
