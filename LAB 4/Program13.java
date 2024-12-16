import java.util.Scanner;

abstract class Shape {
    int l, b,r;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.l = length;
        this.b = breadth;
    }
    void printArea() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        this.b = base;
        this.l = height;
    }
    void printArea() {
        System.out.println("Triangle Area: " + (0.5 * b * l));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        this.r = radius;
    }

    void printArea() {
        System.out.println("Circle Area: " + (Math.PI * r * r));
    }
}

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape rectangle = new Rectangle(20,12);


        Shape triangle = new Triangle(20, 10);
        Shape circle = new Circle(5);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}

