package com.qawinter;

//опишите класс Circle как подкласс Shape. Класс Circle содержит: поле
//        radius, конструктор, переопределенные методы toString() и calcArea().

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Class " + this.getClass() + "; color = " + super.getColor() + "; radius = " + radius + ".";
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
