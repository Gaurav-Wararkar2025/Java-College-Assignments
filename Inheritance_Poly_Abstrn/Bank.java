/*
* # Inheritance,Polymorphism and Abstraction in Java:

18. A bank has a fixed interest rate that should not be changed once it is defined.

Question:

Create a class Bank with a final variable interestRate.

Create a method calculateInterest(double amount) that calculates the interest using the fixed rate.

Write a program to calculate interest for different customers.
 
 */

class Bank {

    final double interestRate = 6.5; // fixed rate

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

    public static void main(String[] args) {

        Bank b = new Bank();

        double customer1 = b.calculateInterest(10000);
        double customer2 = b.calculateInterest(20000);

        System.out.println("Interest for Customer 1: " + customer1);
        System.out.println("Interest for Customer 2: " + customer2);
    }
}