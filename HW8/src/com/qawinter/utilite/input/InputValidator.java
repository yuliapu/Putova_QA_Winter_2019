package com.qawinter.utilite.input;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    private static Scanner scan = new Scanner(System.in);

    public int intInputValidation() throws  NegativeSizeException, InputMismatchException {
        int input = scan.nextInt();
        if(input < 0) throw new NegativeSizeException();
        return input;
    }
    public int sizeInputValidate(int input) throws  NegativeSizeException {

        if(input < 0) throw new NegativeSizeException();
        return input;
    }
}
