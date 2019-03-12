package com.qawinter;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Home work 5 by Putova Yulia. Task 3.");
        int size = inputSize();
        int[] firstArray = createArray(size);
        int[] secondArray = createArray(size);
        int[] sumArray = createSumArray(size, firstArray, secondArray);
        System.out.println("Resulting array:\n" + Arrays.toString(sumArray));

    }

    public static int[] createSumArray(int size, int[] firstArr, int[] secondArr) {
        int[] sumArray = new int[size];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = firstArr[i] + secondArr[i];
        }
        return sumArray;
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
