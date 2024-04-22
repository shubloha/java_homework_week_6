package java_homework_week_6;

import java.util.Scanner;

public class Programme7 {

    public void s1() {

        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit :");

        //Read the temperature from user
        double fahrenheit = scanner.nextDouble();
        //Close the scannner
        scanner.close();

        //convert Fahrenheit to Celsius using the formula (F-32) X 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius is: " + celsius + "°C");


    }
    // Declare one main method
    public static void main(String[] args) {
        Programme7 programme7 = new Programme7();
        programme7.s1();
    }
}
