import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the unit you want to convert from (Feet, Pounds, Fahrenheit): ");
        String fromUnit = scanner.nextLine();

        System.out.print("Enter the unit you want to convert to (Meters, Kgs, Celsius): ");
        String toUnit = scanner.nextLine();

        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        // Perform the conversion
        double result = convert(fromUnit, toUnit, quantity);

        // Print the result
        System.out.println(quantity + " " + fromUnit + " is equal to " + result + " " + toUnit);
    }

    // Method to perform the conversion
    private static double convert(String fromUnit, String toUnit, double quantity) {
        switch (fromUnit.toLowerCase()) {
            case "feet":
                switch (toUnit.toLowerCase()) {
                    case "meters":
                        return quantity * 0.3048;
                    default:
                        System.out.println("Conversion not supported.");
                        break;
                }
                break;
            case "pounds":
                switch (toUnit.toLowerCase()) {
                    case "kgs":
                        return quantity * 0.453592;
                    default:
                        System.out.println("Conversion not supported.");
                        break;
                }
                break;
            case "fahrenheit":
                switch (toUnit.toLowerCase()) {
                    case "celsius":
                        return (quantity - 32) * 5 / 9;
                    default:
                        System.out.println("Conversion not supported.");
                        break;
                }
                break;
            default:
                System.out.println("Conversion not supported.");
                break;
        }
        return 0; // Default return value (if conversion not supported)
    }
}
