/*
* # Inheritance,Polymorphism and Abstraction in Java:

17. A company wants to track how many employees have been created in the system.

Question:

Create a class Employee with attributes name and id.
Use a static variable employeeCount that increases every time a new object is created.

Write a program that:

Creates multiple employee objects
Displays the total number of employees using a static method.
 
 */

class Employee {

    String name;
    int id;

    static int employeeCount = 0; // static variable

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // increment when object is created
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 101);
        Employee e2 = new Employee("Aman", 102);
        Employee e3 = new Employee("Sneha", 103);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayCount(); // static method call
    }
}