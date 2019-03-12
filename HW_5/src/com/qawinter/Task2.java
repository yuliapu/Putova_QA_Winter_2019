package com.qawinter;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Home work 5 by Putova Yulia. Task 2.");
        int[] array = createArray(inputSize());
        countOddIndexes(array);
        countOddValues(array);
    }

    public static void countOddValues(int[] array) {
        int sum = 0, oddCounter = 0;
        for (int element : array) {
            if (element % 2 == 1 || element % 2 == -1) {
                sum += element;
                oddCounter++;
            }
        }
        System.out.println("Number of elements with odd values: " + oddCounter + "\nSum of elements with odd values: " + sum + "\n");
    }

    public static void countOddIndexes(int[] array) {
        int sum = 0, oddCounter = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
            oddCounter++;
        }
        System.out.println("Number of elements with odd indexes: " + oddCounter + "\nSum of elements with odd indexes: " + sum + "\n");
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.println("Created array:\n" + Arrays.toString(array) + "\n");
        return array;
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
