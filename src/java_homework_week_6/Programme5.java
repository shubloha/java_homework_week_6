package java_homework_week_6;


public class Programme5 {
    // Static methods
    public static void add(double num1, double num2) {
        System.out.println("Addition: " + (num1 + num2));
    }

    public static void multiplication(double num1, double num2) {
        System.out.println("multiplication: " + (num1 * num2));
    }

    // Instance methods
    public void subtraction(double num1, double num2) {
        System.out.println("subtraction: " + (num1 - num2));
    }

    public void division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println("division : " + (num1 / num2));
        }
    }

    public static void main(String[] args) {

        double num1 = 20;
        double num2 = 10;
        System.out.println("First number is "+num1);
        System.out.println("Second number is "+num2);
        Programme5 calculator = new Programme5();

        // Using static methods
        add(num1, num2);
        multiplication(num1, num2);

        // Using instance methods
        calculator.subtraction(num1, num2);
        calculator.division (num1, num2);
    }

}
