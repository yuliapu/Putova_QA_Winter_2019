package com.qawinter;

//опишите класс Triangle как подкласс Shape. Класс Triangle содержит:
//        поля a, b, c; конструктор, переопределенные методы toString() и
//        calcArea().

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        if (exist(a, b, c) == true) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
       else{
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
    }

    private boolean exist(double a, double b, double c) {
        return (a < c + b && c < a + b && b < c + a) ? true : false;
    }

    @Override
    public String toString() {
        return "Class " + this.getClass() + "; color = " + super.getColor() +
                "; a = " + a + "; b = " + b + "; c= " + c + ".";
    }

    @Override
    public double calcArea() {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
