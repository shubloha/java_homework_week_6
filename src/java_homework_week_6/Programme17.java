package java_homework_week_6;

import java.util.Scanner;

public class Programme17 {
    // Declare one instance method
    public void d1 (){
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Use to enter a decimal number
        System.out.println("Input a Decimal Number:  ");
        int decimal = scanner.nextInt();

        scanner.close();
        // Convert decimal to binary using Integer.toBinaryString()
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is :"+ binary);
    }
    // Declare one main method
    public static void main (String []args){
       Programme17 programme17 = new Programme17();
       programme17.d1();
    }
}
