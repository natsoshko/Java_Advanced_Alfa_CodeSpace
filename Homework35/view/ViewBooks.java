package com.alfabank.view;

import java.util.List;

public class ViewBooks {
    private InputViewBooks input = new InputViewBooks();
    public void printMenu() {
        System.out.println(
                "1. посмотреть весь список книг (view)\n" +
                        "2. добавить книгу (add)\n" +
                        "3. изменить стоимость книг (edit)\n" +
                        "4. найти книги по автору (author)\n" +
                        "5. найти по издательству (publisher)\n" +
                        "6. найти выпущенные после введенного года (year)\n" +
                        "0. завершить работу (exit)\n"
        );
    }

    public String getCommand() {
        System.out.print(ViewConstants.ENTER_COMMAND);
        return input.inputItem();
    }

    public void printMessage(String text) {
        System.out.println(text);
    }

    public void printBooks(List<String> books) {
        books.stream().forEach(System.out::println);
    }

    public String getInfoBook() {
        System.out.println(ViewConstants.FORMAT_INPUT);
        return input.inputBook();
    }

    public String getIdPercentBook() {
        System.out.println(ViewConstants.ENTER_ID_PERCENT_BOOK);
        return input.inputIdPercentBook();
    }

    public String getSearchAuthor() {
        System.out.println(ViewConstants.ENTER_AUTHOR);
        return input.inputSearchAuthor();
    }

}
