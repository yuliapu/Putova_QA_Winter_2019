package com.qawinter.model;

public class Book {

    private Integer id;
    private static int nextId;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;

    public Book(String name, String author, String publisher, int yearOfPublication, int numberOfPages, double price) {

        this();
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public Book() {
        this.id = nextId;
        nextId++;
    }


    public String viewBook() {

        return "ID: " + this.getId() + ";\nBOOK NAME: " + this.getName() +
                ";   AUTHOR: " + this.getAuthor()
                + ";\nPUBLISHER: " + this.getPublisher() + ";   " +
                "YEAR OF PUBLICATION: " + this.getYearOfPublication() +
                ";   NUMBER OF PAGES: " + this.getNumberOfPages() +
                ";\nPRICE: " + String.format("%.2f", this.getPrice()) + "$.";
    }

    public void editPrice(double percent) {
        this.price += this.price * percent / 100;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
