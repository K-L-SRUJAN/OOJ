
public interface Polygon {

    default double getPerimeter() {
        return 0.0;
    }


    abstract double getArea();
}


class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);  }
}

class Square implements Polygon {
    private double length;
 

    public Square(double length) {
        this.length = length;

    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;  }
}




public class Main3 {
    public static void main(String[] args) {
        Polygon rectangle = new Rectangle(10,20);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea()); 

        Polygon square = new Square(20);
        System.out.println("Rectangle Perimeter: " + square.getPerimeter());
        System.out.println("Rectangle Area: " + square.getArea()); 
    }
}
