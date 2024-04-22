package java_homework_week_6;


import java.util.Scanner;

public class Programme15 {
    // Declare one instance method
    public void s1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        int x = scanner.nextInt();
        System.out.println("Enter Second number ");
        int y = scanner.nextInt();
        scanner.close();
        // Swap the values of the variables
        int z = x;
        x = y;
        y = z;
        // Print the swapped values of the variables
        System.out.println("After swapping");
        System.out.println("first number is : " + x);
        System.out.println("second number is : " + y);
    }

    // Declare one main method
    public static void main(String[] args) {
        Programme15 obj = new Programme15();
        obj.s1();

    }
}
