package com.qawinter.additional;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {
        System.out.println("Home work 5 by Putova Yulia. Additional task 1.");
        int[] array = createArray(inputSize());
        System.out.println(findAvg(array));
        System.out.println(findBiggerNumber(array, findAvg(array)));
    }

    public static double findAvg(int[] array) {
        double average = 0;
        for (int element : array) {
            average += element;
        }
        average /= array.length;
        return average;
    }

    public static int findBiggerNumber(int[] array, double average) {
        int counter = 0;
        for (int element : array) {
            if (element > average) counter++;
        }
        return counter;
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
