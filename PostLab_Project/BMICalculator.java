import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- BMI Calculator ---");

        // Input weight
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Input height
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        // BMI Calculation
        double bmi = weight / (height * height);

        // Output formatting and Category logic
        System.out.printf("\nYour BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        sc.close();
    }
}