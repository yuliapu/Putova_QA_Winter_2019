package com.qawinter.additional;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask2 {
    public static void main(String[] args) {
        System.out.println("Home work 5 by Putova Yulia. Additional task 2.");
        int[] firstArray = createArray(inputSize());
        int[] secondArray = createArray(inputSize());
        int[] resultArray = concatArrays(firstArray, secondArray);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] concatArrays(int[] firstArray, int[] secondArray) {
        int[] resultArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        for (int i = firstArray.length; i < resultArray.length; i++) {
            resultArray[i] = secondArray[i - firstArray.length];
        }
        return resultArray;
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
