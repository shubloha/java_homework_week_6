package java_homework_week_6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Programme2 {
    //1 Declare two static variables
    static int a = 50;
    static String name = "shubham";

    //4 Declare the Main method
    public static void main(String[] args) {
        // Call the static method into the Main method
        s1();
    }

    //2 Declare one static method
    public static void s1() {
        //3.Call both static variables into the static method inside the print statement
        System.out.println(a);
        System.out.println(name);


    }

}
