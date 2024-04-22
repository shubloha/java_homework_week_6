package java_homework_week_6;

import java.util.Scanner;

public class Programme18 {
    // Declare one instance method
    public void d5 (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        long a = scanner.nextLong();

        System.out.println("Input second number: ");
        long b = scanner.nextLong();

        long addition  = a+b;
        long  subtract = a-b;
        long multiplication  = a*b;
        long remainder = a/b;
        System.out.println(a+" + " +b +" = "+addition );
        System.out.println(a+" - "+b +" = "+ subtract );
        System.out.println(a+" * " +b +" = "+multiplication );
        System.out.println(a+" mod "+b +" = "+ remainder );
    }
    // Declare one main method
    public static void main(String[] args) {
        Programme18 programme18 = new Programme18();
        programme18.d5();


    }
}
