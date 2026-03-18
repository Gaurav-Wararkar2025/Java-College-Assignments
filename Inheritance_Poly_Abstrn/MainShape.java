/*
#Classes and Objects in Java:

7.Create an abstract class Shape with an abstract method calculate area() and a method display_info().Create concrete 
subclasses concrete like Circle and Rectangle that must implement their own specific logic for calculate_area(). Try to 
instantiate an object of the Shape class directly and observe the compilation error. Use the subclass objects to call both 
abstract and concrete methods.

*/

abstract class Shape {

    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

class MainShape {
    public static void main(String[] args) {

        // Shape s = new Shape(); ❌ ERROR (cannot instantiate abstract class)

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.display_info();
        System.out.println("Circle Area: " + c.calculate_area());

        r.display_info();
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}