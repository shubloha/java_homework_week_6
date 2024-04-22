package java_homework_week_6;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4 {
    int a = 500;
    String firstname = "Shubahm";
    static int c = 600 ;
    static String lastname = "Panchal";

    public void instance1 (){
        System.out.println(a);
        System.out.println(firstname);
        System.out.println(c);
        System.out.println(lastname);
    }
    public static void static1 (){
        Programme4 programme4 = new Programme4();
        System.out.println(programme4.a);
        System.out.println(programme4.firstname);
        System.out.println(c);
        System.out.println(lastname);

    }
    public static void main (String[]args){
        Programme4 programme4 = new Programme4();
        programme4.instance1();
        static1();

    }
}
