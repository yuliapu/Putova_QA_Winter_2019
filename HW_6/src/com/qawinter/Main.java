package com.qawinter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Home Work 6 by Putova Yulia");

        Books library = new Books(6);

        Book clockworkOrange = new Book(0, "A Clockwork Orange", "Anthony Burgess", "Heinemann", 1962, 192, 24.43);
        Book stranger = new Book(1, "The Stranger", "Albert Camus", "Gallimard", 1942, 159, 15.98);
        Book moskvaPetushki = new Book(2, "Москва - Петушки", "Венедикт Ерофеев", "самиздат", 1973, 192, 4.1 );
        Book plague = new Book (3, "The Plague","Albert Camus", "Gallimard",1947,320, 21.95);
        Book threeComrades = new Book(4, "Three Comrades", "Erich Maria Remarque", "Little, Brown and Company",1937,496,37.99);
        Book archOfTriumph = new Book (5, "Arch of Triumph", "Erich Maria Remarque","Appleton-Century",1945,455,25.99);

        library.addBook(clockworkOrange);
        library.addBook(stranger);
        library.addBook(moskvaPetushki);
        library.addBook(plague);
        library.addBook(threeComrades);
        library.addBook(archOfTriumph);

        library.viewLibrary();

        menu(library);
    }

    public static void menu(Books library) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("********************************\nChoose menu item:" +
                    "\n\t1. View all books\n\t2. Change books price\n\t3. Search by author \n\t4. Search by year\n\t0. Exit");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:{
                    library.viewLibrary();
                    break;
                }
                case 2: {
                    System.out.print("Enter persent: ");
                    library.changePrice(scanner.nextDouble());
                    library.viewLibrary();
                    break;
                }
                case 3: {
                    System.out.print("Enter author: ");
                    String author = scanner.next();
                    System.out.println("\nBooks found:");
                    Books foundBooks = library.findByAuthor(author);
                    foundBooks.viewLibrary();
                    break;
                }
                case 4: {
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.println("\nBooks found:");
                    Books foundBooks = library.findByYear(year);
                    foundBooks.viewLibrary();
                    break;
                }
            }
        }
        while (answer != 0);
    }
}
