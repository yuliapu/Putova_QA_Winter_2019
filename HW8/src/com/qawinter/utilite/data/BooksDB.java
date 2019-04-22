package com.qawinter.utilite.data;

import com.qawinter.model.Book;

public class BooksDB {

    private BooksDB() { }

    private static final Book[] allBooks = {
            new Book("A Clockwork Orange", "Anthony Burgess", "Heinemann", 1962, 192, 24.43),
            new Book("The Stranger", "Albert Camus", "Gallimard", 1942, 159, 15.98),
            new Book("The Plague", "Albert Camus", "Gallimard", 1947, 320, 21.95),
            new Book("Three Comrades", "Erich Maria Remarque", "Little, Brown and Company", 1937, 496, 37.99),
            new Book("Arch of Triumph", "Erich Maria Remarque", "Appleton-Century", 1945, 455, 25.99),
            new Book("Martin Eden", "Jack London", "Macmillan", 1909, 556, 23.95),
            new Book("Nineteen Eighty-Four", "George Orwell", "Secker & Warburg", 1949, 328, 17.95),
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925, 180, 17.97),
            new Book("War and Peace", "Leo Tolstoy", "The Russian Messengerillan", 1865, 1225, 19.50),
            new Book("Brave New World", "Aldous Huxley", "Chatto & Windus", 1932, 288, 15.95)
    };

    public static Book getBook(int index) {
        return allBooks[index];
    }

    public static int getLibSize() {
        return allBooks.length;
    }
}
