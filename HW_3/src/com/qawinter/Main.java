package com.qawinter;

import java.util.Scanner;

public class Main {

    private final static String STAR = "* ";

    public static void main(String[] args) {
        System.out.print("Home work 3 by Putova Yulia");
        menu();
    }

    private static void buildFirstFigure(int sideLength){
        int widthCounter=1, heightCounter = 1;

        while (heightCounter<sideLength){

            widthCounter=heightCounter;
            while (widthCounter>0)
            {
                System.out.print(STAR);
                widthCounter--;
            }
            heightCounter++;
            System.out.println();
        }
        widthCounter++;
        while(heightCounter>0)
        {
            while (widthCounter<=sideLength)
            {
                System.out.print(STAR);
                widthCounter++;
            }
            heightCounter--;
            widthCounter-=heightCounter;
            System.out.println();
        }
    }
    private static void buildSecondFigure(int sideLength){
        int widthCounter=sideLength, heightCounter=1;

        while(heightCounter>0)
        {
            while (widthCounter<=sideLength-heightCounter)
            {
                System.out.print("  ");
                widthCounter++;
            }
            while (widthCounter<=sideLength)
            {
                System.out.print(STAR);
                widthCounter++;
            }
            heightCounter--;
            widthCounter=1;
            System.out.println();
        }
    }

    private static void buildThirdFigure(int sideLength){
        int heightCounter=1, widthCounter;
        while(heightCounter<=sideLength)
        {
            widthCounter=1;
            System.out.println();

            while (widthCounter<=sideLength-heightCounter)
            {
                System.out.print("  ");
                widthCounter++;
            }
            while (widthCounter<=sideLength)
            {
                System.out.print(STAR);
                widthCounter++;
            }
            heightCounter++;
        }
    }

    private static void buildFourthFigure(int sideLength){
        buildThirdFigure(sideLength);
        int counter=1;
        while(counter<=sideLength*2)
        {
            System.out.print("\b");
            counter++;
        }
        buildSecondFigure(sideLength);
    }

    private static void buildFifthFigure(int sideLength,int recursionCounter){
        int heightCounter=1, widthCounter;

        while(heightCounter<=sideLength)
        {
            widthCounter=1;
            System.out.println();

            while (widthCounter<=sideLength-heightCounter)
            {
                System.out.print("  ");
                widthCounter++;
            }
            while (widthCounter<=sideLength)
            {
                System.out.print(STAR+STAR);
                widthCounter++;
            }
            heightCounter++;
        }
        if(recursionCounter==0)
        {
            recursionCounter++;
            buildFifthFigure(sideLength,recursionCounter);
        }
    }
    private static void menu(){
        Scanner scan = new Scanner(System.in);
        int sideLength;
        int answer;
        do {
            System.out.print("\nChoose task:\n\t1. Task 1\n\t2. Task 2\n\t3. Task 3" +
                             "\n\t4. Task 4 \n\t5. Task 5\n\t0. Exit\n");
            System.out.print("Task: ");
            answer = scan.nextInt();

            switch (answer) {
                case 1:
                    System.out.print("Enter length of triangle side: ");
                    sideLength = scan.nextInt();
                    System.out.println();
                    buildFirstFigure(sideLength);
                    break;
                case 2:
                    System.out.print("Enter length of triangle side: ");
                    sideLength = scan.nextInt();
                    System.out.println();
                    buildSecondFigure(sideLength);
                    break;
                case 3:
                    System.out.print("Enter length of triangle side: ");
                    sideLength = scan.nextInt();
                    buildThirdFigure(sideLength);
                    break;
                case 4:
                    System.out.print("Enter length of triangle side: ");
                    sideLength = scan.nextInt();
                    buildFourthFigure(sideLength);
                    break;
                case 5:
                    System.out.print("Enter length of triangle side: ");
                    sideLength = scan.nextInt();
                    buildFifthFigure(sideLength, 0);
                    break;
                default:
                    System.out.print("Goodbye!");
                    break;
            }
        }while (answer!=0);
        scan.close();
    }
}
