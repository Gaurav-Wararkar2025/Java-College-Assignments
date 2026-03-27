/*
# Strings in Java:

9. Define a class Student with attributes id and name.

Override toString() method.

Create object of class.

Display object details using toString().
 
*/

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {

        Student s = new Student(101, "Rahul");

        System.out.println(s); // calls toString()
    }
}