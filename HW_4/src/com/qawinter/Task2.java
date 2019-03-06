package com.qawinter;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Home work 4 by Putova Yulia.\nTask 2. Unique characters search.");
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        System.out.print("Unique characters: ");
        System.out.println(findUnique(string));
    }

    public static String findUnique(String string) {
        String result = "";
        int index = 0;
        char currentSymbol;
        while (index < string.length()) {
            currentSymbol = string.charAt(index);
            if (string.lastIndexOf(currentSymbol) == index && string.indexOf(currentSymbol) == index)
                result += currentSymbol;
            index++;
        }
        return result;
    }


}
