// Abstract class
abstract class Shape {
    int a, b;

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {

    Rectangle(int l, int w) {
        super(l, w);
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

// Triangle class
class Triangle extends Shape {

    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

// Circle class
class Circle extends Shape {

    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        System.out.println("Area of Circle: " + (3.14 * a * a));
    }
}

// Main class
public class MainShape {
    public static void main(String[] args) {

        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(8, 6);
        Shape c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
