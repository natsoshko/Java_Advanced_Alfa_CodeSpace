package com.alfabank.work21;

public class Book {
    public Book() {
        this.id = 1;
        this.author = "Scott Kelby";
        this.title = "Digital Photography";
        this.publisher = "Rocky Nook";
        this.year = 2020;
        this.page = 272;
        this.cost = 1280;
    }

    public Book (String nameBook) {
        this.id = 2;
        this.author = "Ashlee Vance";
        this.title = nameBook;
        this.publisher = "Penguin";
        this.year = 2020;
        this.page = 80;
        this.cost = 235;
    }

    public Book (int num, String auth, String nameBook, String publish, int iYear, int iPage, int iCost) {
        this.id = num;
        this.author = auth;
        this.title = nameBook;
        this.publisher = publish;
        this.year = iYear;
        this.page = iPage;
        this.cost = iCost;
    }

    private int id;
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int page;
    private double cost;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public void view() {
        System.out.println(getId() + " "
                + this.author + " "
                + title + " "
                + publisher + " "
                + year + " "
                + page + " "
                + cost);
    }
}
