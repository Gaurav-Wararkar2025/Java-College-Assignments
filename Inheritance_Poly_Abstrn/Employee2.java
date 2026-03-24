/*
# Inheritance,Polymorphism and Abstraction in Java:

20. A company wants to clearly assign constructor parameters to object variables.

Question:

Create a class Employee2 with variables name and salary.

Use this keyword inside the constructor to initialize object variables.

Display employee details.

 */

class Employee2 {

    String name;
    double salary;

    Employee2(String name, double salary) {
        this.name = name; // using this keyword
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee2 e1 = new Employee2("Rahul", 50000);
        Employee2 e2 = new Employee2("Aman", 60000);

        e1.display();
        e2.display();
    }
}