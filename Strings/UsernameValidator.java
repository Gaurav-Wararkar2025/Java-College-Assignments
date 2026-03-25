/*
# Strings in Java:

1. Create a class called Username Validator.

Accept a username from the user.

Remove leading and trailing spaces.

Convert the username to lowercase.

Display the cleaned username.
 
 */

import java.util.*;

class UsernameValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username:");
        String username = sc.nextLine();

        username = username.trim(); // remove spaces
        username = username.toLowerCase(); // convert to lowercase

        System.out.println("Cleaned Username: " + username);
    }
}