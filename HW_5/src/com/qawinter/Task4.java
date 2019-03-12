package com.qawinter;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Home work 5 by Putova Yulia. Task 4.");
        int[] array = createArray(inputSize());
        splitArray(array);
    }

    public static void splitArray(int[] array) {
        int negativeNumber = countNegativeElements(array);
        int positiveNumber = array.length - negativeNumber;
        int[] positiveArray = new int[positiveNumber];
        int[] negativeArray = new int[negativeNumber];
        for (int i = 0, j = 0, k = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArray[j] = array[i];
                j++;
            } else {
                positiveArray[k] = array[i];
                k++;
            }
        }
        System.out.println("Array with negative numbers: " + Arrays.toString(negativeArray));
        System.out.println("Array with positive numbers: " + Arrays.toString(positiveArray));

    }

    public static int countNegativeElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element < 0) counter++;
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
