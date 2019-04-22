package com.qawinter.view;

import com.qawinter.model.Book;

import java.util.Arrays;

public class ViewBooks {

    private ViewBooks() {
    }

    // final messages
    public static final String INPUT_INT_DATA = "Enter an integer. ";
    public static final String INPUT_DOUBLE_DATA = "Enter a decimal or integer value.";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please. ";
    public static final String INPUT_AUTHOR = "Enter author's name to search.";
    public static final String INPUT_YEAR = "Enter year of publication please.";
    public static final String INPUT_PERCENT = "Enter percent please.";
    public static final String MENU = "Choose an option:\n" +
            " 0. Add some books\n 1. Add a book manually\n 2. Add a random book\n " +
            "3. Find a book by an author\n 4. Change books price\n 5. Find a book by a year\n 6. Sort by price\n" +
            " 7. Sort by author\n 8. Sort by publisher\n 9. Exit";

    public static void print(String text) {
        System.out.println(text);
    }
    public static void print(Book[] books) {
        System.out.println(Arrays.toString(books));
    }

}
