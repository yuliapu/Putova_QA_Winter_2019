package com.qawinter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.print("Home work 2 by Putova Yulia");
        menu();
    }

    public static void swapNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        a += b;
        b -= a;
        b = -b;
        a -= b;

        System.out.print("\n*****Numbers swapped!*****\nFirst number: "+a+"\nSecond number: "+b);
        scan.close();
    }

    public static void subtractReversed(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3-digit number: ");
        int number = scan.nextInt();
        while (number >= 1000) {
            System.out.print("Try again!\t");
            number = scan.nextInt();
        }

        int firstDigit=number / 100;
        int secondDigit=(number - firstDigit * 100) / 10;
        int thirdDigit=number - firstDigit * 100 - secondDigit * 10;
        int reversedNumber = firstDigit + secondDigit * 10 + thirdDigit * 100;

        System.out.print("\nReversed number: "+reversedNumber+"\n Subtraction: "+(number - reversedNumber));
        scan.close();
    }

    public static void convertWeight(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        int poundsWeight = scan.nextInt();

        double kgWeight = 453.6*poundsWeight*0.001;
        int kilos=(int)kgWeight;
        int grams = (int)((kgWeight-kilos)*1000);

        System.out.print("\nWeight in kilos: "+kilos+"kg "+grams+"g");
        scan.close();
    }

    public static void calculateIncome(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter number of months of interest: ");
        int days = scan.nextInt() * 30;
        System.out.print("Enter amount of cash: ");
        int cash = scan.nextInt();

        double income = rate * cash * days / 36500;

        System.out.print("\nIncome is: "+ String.format("%.2f", income));
        scan.close();
    }

    public static void menu(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nChoose task:\n\t1. Task 1\n\t2. Task 2\n\t3. Task 3\n\t4. Task 4\n");
        System.out.print("Task: ");
        int answer = scan.nextInt();

        switch (answer) {
            case 1:  swapNumbers();
                break;
            case 2:  subtractReversed();
                break;
            case 3:  convertWeight();
                break;
            case 4:  calculateIncome();
                break;
            default:  System.out.print("Goodbye!");
                break;
        }
        scan.close();
    }

}
