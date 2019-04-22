package com.qawinter.utilite.data;

import com.qawinter.model.Book;

import java.util.Random;

public class DataGeneratorUtil {

    private static Random rand = new Random();

    private DataGeneratorUtil() {
    }

    public static Book getBook() {

        int bookIndex = rand.nextInt(BooksDB.getLibSize());
        return BooksDB.getBook(bookIndex);
    }

}
