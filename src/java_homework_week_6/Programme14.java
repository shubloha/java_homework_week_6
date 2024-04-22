package java_homework_week_6;

public class Programme14 {
    // Declare one instance method
    public void s1() {

        //Define the width and height of the rectangle
        double width = 5.5;
        double height = 8.5;
        // Calculate the area of the rectangle
        double area = (width * height);
        // Calculate the perimeter of the rectangle
        double perimeter = (2 * (width + height));
        //Print the result
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

    }

    // Declare one main method
    public static void main(String[] args) {
        Programme14 programme14 = new Programme14();

        programme14.s1();
    }
}