import java.util.Scanner;

public class OhmsLawCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double voltage = 0, current = 0, resistance = 0;

        System.out.println("Ohm's Law Calculator");
        System.out.println("Choose the unknown parameter: V (Voltage), I (Current), R (Resistance)");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'V':
            case 'v':
                // Calculate Voltage
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.println("Voltage (V) = " + voltage + "V");
                break;
            case 'I':
            case 'i':
                // Calculate Current
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.println("Current (A) = " + current + "A");
                break;
            case 'R':
            case 'r':
                // Calculate Resistance
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.println("Resistance (Ω) = " + resistance + "Ω");
                break;
            default:
                System.out.println("Invalid choice! Please choose V, I, or R.");
        }

        scanner.close();
    }
}
