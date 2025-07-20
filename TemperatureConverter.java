import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String unit = scanner.next().toUpperCase();

        switch (unit) {
            case "C":
                double fFromC = (value * 9/5) + 32;
                double kFromC = value + 273.15;
                System.out.println("Fahrenheit: " + fFromC);
                System.out.println("Kelvin: " + kFromC);
                break;

            case "F":
                double cFromF = (value - 32) * 5/9;
                double kFromF = cFromF + 273.15;
                System.out.println("Celsius: " + cFromF);
                System.out.println("Kelvin: " + kFromF);
                break;

            case "K":
                double cFromK = value - 273.15;
                double fFromK = (cFromK * 9/5) + 32;
                System.out.println("Celsius: " + cFromK);
                System.out.println("Fahrenheit: " + fFromK);
                break;

            default:
                System.out.println("Invalid unit! Please enter C, F, or K.");
        }

        scanner.close();
    }
}
