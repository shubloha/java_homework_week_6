package java_homework_week_6;

import java.util.Scanner;

public class Programme8 {
    // Declare one instance method
    public void instance (){

        // Create a Scanner object to read input from the user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        // Read the base of the triangle from the user
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle ");

        double height = scanner.nextDouble();

        scanner.close();
        // Calculate the area of the triangle using the formula: (base * height) / 2
        double area = (base * height) / 2;

        System.out.println("Area of triangle is :" + area);
    }
    // Declare one main method
    public static void main(String[] args) {
        Programme8 programme8 = new Programme8();
        programme8.instance();

    }
}
