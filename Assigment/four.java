import java.util.Scanner;

public class DCMotorSpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Voltage, BackEMF, and MotorConstant
        System.out.print("Enter the Voltage (V): ");
        double voltage = scanner.nextDouble();
        
        System.out.print("Enter the Back EMF (V): ");
        double backEmf = scanner.nextDouble();
        
        System.out.print("Enter the Motor Constant (K): ");
        double motorConstant = scanner.nextDouble();
        
        // Validate inputs
        if (voltage <= 0 || backEmf <= 0 || motorConstant <= 0) {
            System.out.println("Error: All inputs must be positive values.");
            return;
        }
        
        if (motorConstant == 0) {
            System.out.println("Error: Motor constant cannot be zero to avoid division by zero.");
            return;
        }
        
        // Calculate speed in RPM (Revolutions Per Minute)
        double speed = (voltage - backEmf) / motorConstant * 60;
        
        // Output: Display the calculated speed in RPM
        System.out.println("The speed of the DC motor is: " + speed + " RPM");
    }
}
