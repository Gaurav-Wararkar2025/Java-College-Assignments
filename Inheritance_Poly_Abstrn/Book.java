/*
# Inheritance,Polymorphism and Abstraction in Java:

19. A library wants to store details of multiple books.

Question:

Create a class Book with attributes:

title
author
price

Create an array of Book objects and display the details of all books.

 */

class Book {

    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book("Java", "James Gosling", 500);
        books[1] = new Book("Python", "Guido", 400);
        books[2] = new Book("C++", "Bjarne", 450);

        for (Book b : books) {
            b.display();
        }
    }
}