package com.qawinter.utilite.input;

public class NegativeSizeException extends Exception {
    @Override
    public String getMessage() {
        return "Input must be a positive value!";
    }
}
