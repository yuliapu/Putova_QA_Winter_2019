package com.qawinter.additional;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {
        System.out.println("Home work 5 by Putova Yulia. Additional task 2.");
        int[] array = createArray(inputSize());
        findMinMax(array);

    }

    public static void findMinMax(int[] array) {
        int minElement = Integer.MAX_VALUE, maxElement = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > maxElement) maxElement = element;
            if (element < minElement) minElement = element;
        }
        System.out.println("Max element: " + maxElement + "\nMin element: " + minElement);
        System.out.println(Arrays.toString(deleteDuplicates(array, maxElement, minElement)));
    }

    public static int[] deleteDuplicates(int[] array, int maxElement, int minElement) {
        int lengthCounter = 0;
        for (int element : array) {
            if (element != minElement && element != maxElement) lengthCounter++;

        }
        int[] resultArray = new int[lengthCounter];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != minElement && array[i] != maxElement) {
                resultArray[j] = array[i];
                j++;
            }
        }
        return resultArray;
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) - 5;
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
