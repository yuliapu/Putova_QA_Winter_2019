package com.qawinter.utilite;

import com.qawinter.view.ViewBooks;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scan = new Scanner(System.in);

    public static int inputInt(ViewBooks view) {
       while (!scan.hasNextInt()) {
            view.print(view.WRONG_INPUT_DATA + view.INPUT_INT_DATA);
            scan.next();
        }
        return scan.nextInt();
    }

    public static double inputDouble(ViewBooks view) {
       while (!scan.hasNextDouble()) {
            view.print(view.WRONG_INPUT_DATA + view.INPUT_DOUBLE_DATA);
            scan.next();
        }
        return scan.nextDouble();
    }

    public static String inputString() {
        return scan.next();
    }


}
