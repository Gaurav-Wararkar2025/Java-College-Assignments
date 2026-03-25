/*
# Strings in Java:

3. Define a class StudentNameComparison.

Accept two student names.

Compare them using case-sensitive comparison.

Compare them using case-insensitive comparison.

Display appropriate message.
 
 */

import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String name1 = sc.nextLine();

        System.out.println("Enter Second Name:");
        String name2 = sc.nextLine();

        // Case-sensitive
        if (name1.equals(name2)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are different (case-sensitive)");
        }

        // Case-insensitive
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are different (case-insensitive)");
        }
    }
}