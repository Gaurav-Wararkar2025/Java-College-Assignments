/*
# Strings in Java:

4. Create a class MessageFormatter.

Accept first name and last name.

Concatenate both names with space.

Display full name in proper format.
 
 */

import java.util.*;

class MessageFormatter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String first = sc.nextLine();

        System.out.println("Enter Last Name:");
        String last = sc.nextLine();

        String fullName = first + " " + last; // concatenation

        System.out.println("Full Name: " + fullName);
    }
}