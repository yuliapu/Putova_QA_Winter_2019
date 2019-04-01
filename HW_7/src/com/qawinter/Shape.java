package com.qawinter;

//опишите класс Shape (поле color, конструктор, переопределенный метод
//        toString() (строка вида "class=...: color=..."), метод вычисления площади
//        фигуры calcArea(), который возвращает значение 0.0) .
public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Class "+this.getClass()+"; color = " + color+".";
    }

    public double calcArea(){
        return 0.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
