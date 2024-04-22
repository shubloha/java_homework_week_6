package java_homework_week_6;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Pragramme3 {
    //1 Declare one instance and one static variable.
    int a = 20;
    static int b = 30;

    //Declare one instance method
    public void Ins1() {
        System.out.println(a);
        System.out.println(b);

    }

    //  Declare one static method
    public static void Static1() {
        Pragramme3 pragramme3 = new Pragramme3();
        System.out.println(pragramme3.a);
        System.out.println(b);


    }

    // Declare the Main method.
    public static void main(String[] args) {
        Pragramme3 pragramme3 = new Pragramme3();
        pragramme3.Ins1();
        Static1();
    }
}
