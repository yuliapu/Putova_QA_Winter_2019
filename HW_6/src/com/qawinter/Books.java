package com.qawinter;

public class Books {

    private Book[] books;

    public Books(int size) {
        if (size < 0) return;
        else books = new Book[size];
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }
    }

    public void viewLibrary() {
        for (Book book : books)
            if (book != null)
                book.viewBook();
    }

    public void changePrice(double percent) {
        double currPrice;
        double newPrice;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                currPrice = books[i].getPrice();
                newPrice = currPrice * (100 + percent) / 100;
                books[i].setPrice(newPrice);
            }
        }

    }

    public Books findByAuthor(String author) {
        Books foundBooks = new Books(books.length);
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getAuthor().toLowerCase().lastIndexOf(author.toLowerCase()) != -1) {
                foundBooks.addBook(books[i]);
            }
        }
        if (foundBooks.books[0] == null) {
            System.out.println("There are no books by this author!");
        }
        return foundBooks;
    }

    public Books findByYear(int year) {
        Books foundBooks = new Books(books.length);
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getYearOfPublication() > year)
                foundBooks.addBook(books[i]);
        }
        if (foundBooks.books[0] == null) {
            System.out.println("There are no books published after this year!");
        }
        return foundBooks;
    }
}