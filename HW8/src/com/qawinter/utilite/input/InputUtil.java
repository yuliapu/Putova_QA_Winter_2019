package com.qawinter.utilite.input;

import com.qawinter.view.ViewBooks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

    private InputUtil() {
    }

    private static Scanner scan = new Scanner(System.in);
    private static InputValidator inputValidator = new InputValidator();

    public static int inputInt() {
        int result = 0;
        try {
            result = inputValidator.intInputValidation();
        }
        catch (InputMismatchException | NegativeSizeException e){
           ViewBooks.print(ViewBooks.WRONG_INPUT_DATA);
        }
        return result;
    }

    public static double inputDouble() {
     /*   while (!scan.hasNextDouble()) {
            ViewBooks.print(ViewBooks.WRONG_INPUT_DATA + ViewBooks.INPUT_DOUBLE_DATA);
            scan.next();
        }*/
        return scan.nextDouble();
    }

    public static String inputString() {
        return scan.next();
    }


}
