/*
* #Inheritance,Polymorphism and Abstraction in Java:

9. In a Calculator class, create multiple methods named add() with different
parameter lists (e.g., one taking two integers, another taking three
integers, and a third taking two doubles).

Call the add() method with various arguments in your main program,
demonstrating that the correct method is selected at compile time based on
the arguments provided.

 */

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum (2 ints): " + c.add(2, 3));
        System.out.println("Sum (3 ints): " + c.add(2, 3, 4));
        System.out.println("Sum (2 doubles): " + c.add(2.5, 3.5));
    }
}