/*
#Classes and Objects in Java:

 2.Design a Book class (title, author, ISBN) and a Library class that manages a collection 
 (e.g., an ArrayList) of Book objects. Implement methods in Library to add a new book, remove 
 a book by ISBN, and display all available books.
 */

import java.util.*;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book Added");
    }

    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.ISBN.equals(isbn)) {
                books.remove(b);
                System.out.println("Book Removed");
                return;
            }
        }
        System.out.println("Book not found");
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.ISBN);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "James Gosling", "101");
        Book b2 = new Book("Python", "Guido", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();

        lib.removeBook("101");

        lib.displayBooks();
    }
}