package com.qawinter;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Home work 5 by Putova Yulia. Task 1.");
        int[] array = createArray(inputSize());
        printArray(array);
        printReversedArray(array);
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Array in direct order:\n" + Arrays.toString(array));
        /*
        System.out.println("Array in direct order:");
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1] + "]");
         */
    }

    public static void printReversedArray(int[] array) {
        System.out.println("Array in reverse order:");
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[0] + "]");
    }

    public static int inputSize() {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter array size: ");
            size = scanner.nextInt();
            if (size < 0) System.out.println("Array size must be a positive integer!");
        } while (size < 0);
        return size;
    }
}
