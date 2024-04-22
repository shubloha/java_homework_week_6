package java_homework_week_6;


import java.util.Scanner;

public class Programme13 {

    // Declare one instance method
    public void m1() {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number :");
        float f = scanner.nextInt();
        System.out.println("Please enter second number :");
        float s = scanner.nextInt();
        System.out.println("Please enter third number :");
        float t = scanner.nextInt();
        scanner.close();

        // average formula
        float avg = (f + s + t) / 2;
        System.out.println("The average of three numbers are : " + avg);
    }

    // Declare one main method
    public static void main(String[] args) {
        Programme13 obj = new Programme13();
        obj.m1();

    }
}
