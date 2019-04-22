package com.qawinter.model;

import java.util.Arrays;
import java.util.Comparator;

public class Books {

    //books amount
    private int booksAmount = 0;
    private Book[] myLibrary;

    public Books(int size) {
        myLibrary = new Book[size];
    }

    public void addBook(Book newBook) {
        if (booksAmount == myLibrary.length) {
            expandLibrary();
            addBook(newBook);

        } else {
            myLibrary[booksAmount] = newBook;
            booksAmount++;

        }
    }

    public void expandLibrary() {

        this.myLibrary = Arrays.copyOf(this.myLibrary, this.myLibrary.length * 2);

    }

    @Override
    public String toString() {
        if (booksAmount > 0) {//it can be another method
            StringBuilder libraryView = new StringBuilder();
            for (int i = 0; i < booksAmount; i++) {
                libraryView.append(myLibrary[i] + "\n");
            }
            return libraryView.toString();
        } else return "No books in library.";
    }

    public void changePrice(double percent) {

        for (int i = 0; i < booksAmount; i++) {
            myLibrary[i].editPrice(percent);
        }

    }

    public Books findByAuthor(String author) {
        Books foundBooks = new Books(booksAmount);
        for (int i = 0; i < booksAmount; i++) {
            if (myLibrary[i].getAuthor().toLowerCase().lastIndexOf(author.toLowerCase()) != -1) {
                foundBooks.addBook(myLibrary[i]);
            }
        }
        return foundBooks;
    }

    public Books findByYear(int year) {
        Books foundBooks = new Books(booksAmount);
        for (int i = 0; i < booksAmount; i++) {
            if (myLibrary[i].getYearOfPublication() > year)
                foundBooks.addBook(myLibrary[i]);
        }
        return foundBooks;
    }

    public Book[] sortByAuthor() {
        Book[] sortedBooks = Arrays.copyOf(myLibrary, booksAmount);
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return sortedBooks;
    }

    public Book[] sortByPublisher() {
        Book[] sortedBooks = Arrays.copyOf(myLibrary, booksAmount);
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublisher().compareTo(o2.getPublisher());
            }
        });
        return sortedBooks;
    }

    public Book[] sortByPrice() {
        Book[] sortedBooks = Arrays.copyOf(myLibrary, booksAmount);
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) return -1;
                if (o1.getPrice() < o2.getPrice()) return 1;
                return 0;
            }
        });
        return sortedBooks;

    }
}