package java_homework_week_6;

public class Programme20 {
    // Declare one main method
    public void s25() {
        // Define the variables
        double gallons = 10.870;
        double pricePerGallon = 2.089;
        double fuelTotal = gallons * pricePerGallon;

        // Print the top border
        System.out.println("+------------------------+");

        // Print the content lines
        System.out.println("|                        |");
        System.out.println("|       CORNER STORE      |");
        System.out.println("|                        |");
        System.out.println("|   2015-03-29 04:38PM   |");
        System.out.println("|                        |");
        System.out.println("|   Gallons: " + gallons + "      |");
        System.out.println("|   Price/gallon: $ " + pricePerGallon + "|");
        System.out.println("|                        |");
        System.out.println("|   Fuel total: $ " + fuelTotal + "  |");
        System.out.println("|                        |");

        // Print the bottom border
        System.out.println("+------------------------+");
    }

    // Declare one main method
    public static void main(String[] args) {
        Programme20 programme20 = new Programme20();
        programme20.s25();

    }
}


