package java_homework_week_6;

import java.util.Locale;
import java.util.Scanner;

public class Programme9 {

    // Declare one instance method
    public void instance() {
        // Create a Scanner object to read input from the user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string in uppercase : ");

        String uppercase = scanner.nextLine();

        scanner.close();

        String lowercase = uppercase.toLowerCase(Locale.ROOT);

        System.out.println("String in lowercase : " + lowercase);

    }
    // Declare one main method
    public static void main(String[] args) {

        Programme9 programme9 = new Programme9();
        programme9.instance();

    }
}
