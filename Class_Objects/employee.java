/*
#Classes and Objects in Java:

5. Define a class employee with the following specification:



Members are: empno of type integer, ename of type String, basic, hr and da are of type float, netpay of type float.

Member functions:

Calculate(): A function to find basix+hra+da with the float return type.

havedata(): function to accept values for empno, ename, basic, hra, da and invoke calculate() to calculate netpay.

dispdata(): function to display all the data members.

 */

import java.util.Scanner;

class employee {

    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    float Calculate() {
        netpay = basic + hra + da;
        return netpay;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Number:");
        empno = sc.nextInt();

        System.out.println("Enter Employee Name:");
        ename = sc.next();

        System.out.println("Enter Basic Salary:");
        basic = sc.nextFloat();

        System.out.println("Enter HRA:");
        hra = sc.nextFloat();

        System.out.println("Enter DA:");
        da = sc.nextFloat();

        Calculate();
    }

    void dispdata() {
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String args[]) {

        employee e = new employee();

        e.havedata();
        e.dispdata();
    }
}