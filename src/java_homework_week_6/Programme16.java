package java_homework_week_6;

import java.util.Scanner;

public class Programme16 {
    // Declare one instance method
    public void s2() {

        // Create a scanner object for read the data from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first Binary Number :  ");
        String binary1 = scanner.nextLine();

        System.out.println("Enter the second binary Number : ");
        String binary2 = scanner.nextLine();

        scanner.close();
        // Convert the binary strings to integers
        int n1 = Integer.parseInt(binary1, 2);
        int n2 = Integer.parseInt(binary2, 2);
        // Add the binary numbers
        int sum = n1 + n2;
        //convert the sum back to binary string
        String binarySum = Integer.toBinaryString(sum);
        //Diplay the result
        System.out.println("Sum of binary numbers:" + binarySum);
    }
    // Declare one main method
    public static void main(String[] args) {
        Programme16 programme16 = new Programme16();
        programme16.s2();
    }
}
