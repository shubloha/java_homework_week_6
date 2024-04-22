package java_homework_week_6;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme
 */

public class Programme1 {

    // 1. Declare two instance variables.
    int a = 100;
    String country = "India";

    //1.4 Declare the Main method.
    public static void main(String[] args) {
        //1.5 Call the above instance method into the Main method
        Programme1 programme1 = new Programme1(); //object created
        programme1.s1();
    }

    //1.2 Declare one instance method
    public void s1() {
        //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(country);


    }
}
