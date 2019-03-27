package com.qawinter.model;

import java.util.Arrays;

public class Books {

    //books amount
    private int booksAmount = 0;
    private Book[] books;

    public Books(int size) {
        books = new Book[size];
    }

    public void addBook(Book newBook) {
        if (booksAmount == books.length) {
            expandLibrary();
            addBook(newBook);

        } else {
            books[booksAmount] = newBook;
            booksAmount++;

        }
    }

    public void expandLibrary() {

        this.books = Arrays.copyOf(this.books, this.books.length * 2);

    }

    public String viewLibrary() {
        if (booksAmount > 0) {//it can be another method
            String libraryView = "";
            for (int i = 0; i < booksAmount; i++) {
                libraryView += books[i].viewBook();
                libraryView += "\n";
            }
            return libraryView;
        } else return "No books in library.";
    }

    public void changePrice(double percent) {

        for(int i=0;i<booksAmount;i++){
           books[i].editPrice(percent);
       }

    }

    public Books findByAuthor(String author) {
        Books foundBooks = new Books(booksAmount);
        for (int i = 0; i < booksAmount; i++) {
            if (books[i].getAuthor().toLowerCase().lastIndexOf(author.toLowerCase()) != -1) {
                foundBooks.addBook(books[i]);
            }
        }
        return foundBooks;
    }

    public Books findByYear(int year) {
        Books foundBooks = new Books(booksAmount);
        for (int i = 0; i < booksAmount; i++) {
            if (books[i].getYearOfPublication() > year)
                foundBooks.addBook(books[i]);
        }
        return foundBooks;
    }


}