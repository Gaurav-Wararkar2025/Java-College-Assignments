/*
#Classes and Objects in Java:

4. Define a class Resort with the following description:

Members are: RNo to store Room Number, Name store customer name, Charges to store per day charges, Days to store number of days of stay.

Member functions:

Charges and if the Compute() to calculate and return Amount as Days values of Days*Charges is more than 11000 then as 1.02*Days Charges

Getinfo() A function to enter the content Rno, Name, Charges and Days.

DispInfo() A function to enter the content Rno, Name, Charges, Days and Amount by calling function Compute().
 */

import java.util.*;

class Resort {

    int Rno;
    String Name;
    int Charges;
    int Days;

    double Compute() {

        double amount = Days * Charges;

        if (amount > 11000)
            amount = 1.02 * amount;

        return amount;
    }

    void Getinfo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Room Number:");
        Rno = sc.nextInt();

        System.out.println("Enter Name:");
        Name = sc.next();

        System.out.println("Enter Charges per day:");
        Charges = sc.nextInt();

        System.out.println("Enter Days of Stay:");
        Days = sc.nextInt();
    }

    void DispInfo() {

        System.out.println("Room No: " + Rno);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + Compute());
    }

    public static void main(String[] args) {

        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}