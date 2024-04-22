package java_homework_week_6;
import java.util.Scanner;
public class Programme6 {



    // Declare the instance method.
    public  void piArea (){

        Scanner scanner = new Scanner (System.in);

        System.out.println();

        System.out.println("Enter the radius of the circle:");

        double radius = scanner.nextDouble();

        scanner.close();

        double area= Math.PI*radius*radius;

        System.out.println("The area of the circle with radius "+radius+ "  is "+area
        );

// Declare the Main method.
    }
    public static void main (String[]args){

        Programme6 programme6 = new Programme6();
        programme6.piArea();
    }
}
