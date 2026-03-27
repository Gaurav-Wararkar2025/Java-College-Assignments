/*
# Exception Handling & Multithreading:

12. Online Division Calculator

Create a class DivisionCalculator. Accept two integers from user. Perform division operation. 
Handle division by zero using try-catch.

Output: If valid: 'Result: <value>' Else: 'Cannot divide by zero'
 
 */

import java.util.*;

class DivisionCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}