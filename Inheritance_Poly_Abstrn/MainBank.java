/*
* # Inheritance,Polymorphism and Abstraction in Java:

10.Create an interface Bank with method getInterest Rate(). Create classes
SBI, HDFC, and ICICI that implement the interface and return different
interest rates.

Write a Java program to display the interest rate of each bank.
 
 */

interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 7.5;
    }
}

class MainBank {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest: " + b1.getInterestRate());
        System.out.println("HDFC Interest: " + b2.getInterestRate());
        System.out.println("ICICI Interest: " + b3.getInterestRate());
    }
}