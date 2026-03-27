/*
# Strings in Java:

10. Create a class PasswordMaskingSystem.

Accept password from the user.

Replace all characters except last two using replace()

Display masked password.
 
*/

import java.util.*;

class PasswordMaskingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password:");
        String password = sc.nextLine();

        int len = password.length();

        if (len > 2) {
            String masked = password.substring(0, len - 2).replaceAll(".", "*")
                    + password.substring(len - 2);

            System.out.println("Masked Password: " + masked);
        } else {
            System.out.println("Password too short to mask");
        }
    }
}