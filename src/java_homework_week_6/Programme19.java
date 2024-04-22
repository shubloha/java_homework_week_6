package java_homework_week_6;

import java.util.Scanner;

public class Programme19 {
    // Declare one instance method
    public void s8 (){
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Convert the string to lowercase using the toLowerCase() method
        String lowercaseString = input.toLowerCase();

        // Display the lowercase string
        System.out.println("String in lowercase: " + lowercaseString);
    }
    // Declare one main method
    public static void main(String[] args) {

        Programme19 programme19 = new Programme19();
        programme19.s8();


    }
}
