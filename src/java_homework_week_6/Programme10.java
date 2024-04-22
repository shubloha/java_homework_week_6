package java_homework_week_6;

import java.util.Scanner;

public class Programme10 {

    // Declare one instance method
    public void s1() {


        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number from the user
        int number = scanner.nextInt();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Print the multiplication table up to 10 for the entered number
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i + " = " + (number * i));


        }


    }

    //  Declare one main method
    public static void main(String[] args) {
        Programme10 obj = new Programme10();
        obj.s1();
    }
}

