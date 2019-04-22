
package com.qawinter.controller;

import com.qawinter.model.Book;
import com.qawinter.model.Books;
import com.qawinter.utilite.data.DataGeneratorUtil;
import com.qawinter.view.ViewBooks;
import com.qawinter.utilite.input.InputUtil;

public class ControllerBooks {

    private Books books;

    public void run() {
        ViewBooks.print("Enter your library size: ");
        books = new Books(InputUtil.inputInt());
        int answer;
        do {
            ViewBooks.print(ViewBooks.MENU);
            answer = InputUtil.inputInt();
            switch (answer) {
                case 0:
                    addSomeBooks();
                    ViewBooks.print(books.toString());
                    break;
                case 1:
                    manualAddBook();
                    ViewBooks.print(books.toString());
                    break;
                case 2:
                    randomAddBook();
                    ViewBooks.print(books.toString());
                    break;
                case 3:
                    findByAuthor();
                    break;
                case 4:
                    changePrice();
                    break;
                case 5:
                    findByYear();
                    break;
                case 6:
                    sortByPrice();
                    break;
                case 7:
                    sortByAuthor();
                    break;
                case 8:
                    sortByPublisher();
                    break;
                case 9: default:
                    ViewBooks.print("Bye!");
                    break;
            }
        } while (answer != 9);
    }

    public void sortByAuthor() {
        ViewBooks.print(books.sortByAuthor());
    }

    public void sortByPrice() {
        ViewBooks.print(books.sortByPrice());
    }

    public void sortByPublisher() {
        ViewBooks.print(books.sortByPublisher());
    }

    public void addSomeBooks() {
        ViewBooks.print("Enter number of books to add: ");
        int amount = InputUtil.inputInt();
        for (int i = 0; i < amount; i++) {
            books.addBook(DataGeneratorUtil.getBook());
        }
    }

    public void randomAddBook() {
        books.addBook(DataGeneratorUtil.getBook());
    }

    public void manualAddBook() {
        Book newBook = new Book();

        ViewBooks.print("Enter name ");
        newBook.setName(InputUtil.inputString());
        ViewBooks.print("Enter author ");
        newBook.setAuthor(InputUtil.inputString());
        ViewBooks.print("Enter publisher ");
        newBook.setPublisher(InputUtil.inputString());
        ViewBooks.print("Enter year of publication ");
        newBook.setYearOfPublication(InputUtil.inputInt());
        ViewBooks.print("Enter number of pages ");
        newBook.setNumberOfPages(InputUtil.inputInt());
        ViewBooks.print("Enter price ");
        newBook.setPrice(InputUtil.inputDouble());

        books.addBook(newBook);
    }

    public void findByAuthor() {
        ViewBooks.print(ViewBooks.INPUT_AUTHOR);
        Books foundBooks = books.findByAuthor(InputUtil.inputString());
        ViewBooks.print(foundBooks.toString());
    }

    public void changePrice() {
        ViewBooks.print(ViewBooks.INPUT_PERCENT);
        books.changePrice(InputUtil.inputDouble());
        ViewBooks.print(books.toString());
    }

    public void findByYear() {
        ViewBooks.print(ViewBooks.INPUT_YEAR);
        Books foundBooksByYear = books.findByYear(InputUtil.inputInt());
        ViewBooks.print(foundBooksByYear.toString());
    }
}


