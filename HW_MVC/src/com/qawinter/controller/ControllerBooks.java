package com.qawinter.controller;

import com.qawinter.model.Book;
import com.qawinter.model.Books;
import com.qawinter.utilite.DataGeneratorUtil;
import com.qawinter.view.ViewBooks;
import com.qawinter.utilite.InputUtil;

public class ControllerBooks {

    private Books books;
    private ViewBooks viewBooks = new ViewBooks();

    public void run() {
        viewBooks.print("Enter library size: ");
        books = new Books(InputUtil.inputInt(viewBooks));

        //наполнение книгами . создать источник данных (новый класс), который возвращает книги для библиотеки
        viewBooks.print("Enter number of books to add: ");
        int amount = InputUtil.inputInt(viewBooks);
        for (int i = 0; i < amount; i++) {
            books.addBook(DataGeneratorUtil.getBook());
        }
        viewBooks.print(books.viewLibrary());

        findByAuthor();
        changePrice();
        findByYear();
    }

    public void findByAuthor() {
        viewBooks.print(viewBooks.INPUT_AUTHOR);
        Books foundBooks = books.findByAuthor(InputUtil.inputString());
        viewBooks.print(foundBooks.viewLibrary());
    }

    public void changePrice() {
        viewBooks.print(viewBooks.INPUT_PERCENT);
        books.changePrice(InputUtil.inputDouble(viewBooks));
        viewBooks.print(books.viewLibrary());
    }

    public void findByYear() {
        viewBooks.print(viewBooks.INPUT_YEAR);
        Books foundBooksByYear = books.findByYear(InputUtil.inputInt(viewBooks));
        viewBooks.print(foundBooksByYear.viewLibrary());
    }
}
