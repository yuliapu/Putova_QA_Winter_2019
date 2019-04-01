package com.qawinter;

//опишите класс Rectangle как подкласс Shape. Класс Rectangle содержит:
//        поля width и height, конструктор, переопределенные методы toString() и
//        calcArea().

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Class " + this.getClass() + "; color = " + super.getColor() +
                "; width = " + width + "; height = " + height + ".";
    }

    @Override
    public double calcArea() {
        return width * height;
    }

}
