package com.qawinter;

// опишите класс Main с методом main(), в котором создайте массив фигур
//        (четыре прямоугольника, три окружности, два треугольника) и
//        отобразите его в консоль вместе с информацией о площади фигур.
//        Предусмотрите для вывода массива фигур некоторый метод класса Main.
//         добавьте в класс Main метод вычисления общей площади всех фигур
//        созданного массива.

//         добавьте в класс Main метод вычисления общей площади фигур каждого
//        типа в созданном массиве (т.е. метод возвращает массив суммарных
//        площадей каждого типа фигур).

//         добавьте в метод main() вызов описанных методов.

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = createShapes();
        System.out.println(showShapesWithAreas(shapes));
        System.out.println(showAreaSum(shapes));

        double[] areasByShapes = calcAreaByShapes(shapes);
        System.out.println(showAreaByShapes(areasByShapes));
    }

    public static Shape[] createShapes() {
        Shape[] shapes = new Shape[9];
        String[] colors = {"red", "blue", "white", "yellow", "green", "black", "brown", "pink"};
        for (int i = 0; i < shapes.length; i++) {
            if (i < 4)
                shapes[i] = new Rectangle(colors[(int) Math.random() * colors.length], getSide(), getSide());
            else if (i < 7)
                shapes[i] = new Circle(colors[(int) Math.random() * colors.length], getSide());
            else if (i < shapes.length)
                shapes[i] = new Triangle(colors[(int) Math.random() * colors.length], getSide(), getSide(), getSide());
        }
        return shapes;
    }

    public static int getSide() {
        return (int) (Math.random() * 20 + 1);
    }

    public static String showShapesWithAreas(Shape[] shapes) {
        String result = "";
        for (Shape shape : shapes) {
            result += shape.toString() + "\n    Area = " + String.format("%.2f", shape.calcArea()) + "\n";
        }
        return result;
    }

    public static String showShapes(Shape[] shapes) {
        String result = "";
        for (Shape shape : shapes) {
            result += shape.toString() + "\n";
        }
        return result;
    }

    /*public static double calcAreaSum(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calcArea();
        }
        return sum;
    }*/

    public static double calcAreaSum(Shape[] shapes) {
        return calcTrianglesArea(shapes) + calcRectanglesArea(shapes) + calcCirclesArea(shapes);
    }

    public static String showAreaSum(Shape[] shapes) {
        return "Average area: " + String.format("%.2f", calcAreaSum(shapes));
    }

    public static String showAreaByShapes(double[] areasByShapes) {
        return "Triangles area: " + String.format("%.2f", areasByShapes[0]) +
                "\nRectangles area: " + String.format("%.2f", areasByShapes[1]) +
                "\nCircles area: " + String.format("%.2f", areasByShapes[2]);
    }

    public static double[] calcAreaByShapes(Shape[] shapes) {
        return new double[]{calcTrianglesArea(shapes), calcRectanglesArea(shapes), calcCirclesArea(shapes)};
    }

    public static double calcTrianglesArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Triangle)
                result += shape.calcArea();
        }
        return result;
    }

    public static double calcRectanglesArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle)
                result += shape.calcArea();
        }
        return result;
    }

    public static double calcCirclesArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                result += shape.calcArea();
        }
        return result;
    }
}
