package com.qawinter;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Home work 4 by Putova Yulia.\nTask 1. Decimal to Binary Converter.");
        System.out.print("Enter decimal: ");
        int decimal = scanner.nextInt();
        System.out.print("Binary representation: ");
        System.out.println(reverseString(representBinary(decimal)));

    }

    public static String representBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary += decimal % 2;
            decimal /= 2;
        }
        return binary;
    }

    public static String reverseString(String string) {
        String reversedString = "";
        int index = string.length();
        while (--index >= 0) {
            reversedString += string.charAt(index);
        }
        return reversedString;
    }

}
