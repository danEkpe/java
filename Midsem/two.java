import java.util.Scanner;

class ElectricityBill {
    // Members of the class
    int consumerNo;
    String consumerName;
    int prevMonthReading;
    int currMonthReading;
    String connectionType;

    // Constructor to initialize the members
    public ElectricityBill(int consumerNo, String consumerName, int prevMonthReading, int currMonthReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevMonthReading = prevMonthReading;
        this.currMonthReading = currMonthReading;
        this.connectionType = connectionType;
    }

    // Method to calculate the bill amount for domestic connection
    public double calculateDomesticBill(int units) {
        double amount = 0;

        if (units <= 100) {
            amount = units * 1;
        } else if (units <= 200) {
            amount = (100 * 1) + (units - 100) * 2.5;
        } else if (units <= 500) {
            amount = (100 * 1) + (100 * 2.5) + (units - 200) * 4;
        } else {
            amount = (100 * 1) + (100 * 2.5) + (300 * 4) + (units - 500) * 6;
        }

        return amount;
    }

    // Method to calculate the bill amount for commercial connection (Example, if needed)
    public double calculateCommercialBill(int units) {
        // Implement commercial tariff calculation here if needed
        return 0;
    }

    // Method to calculate the total units consumed
    public int getUnitsConsumed() {
        return currMonthReading - prevMonthReading;
    }

    // Method to generate the bill
    public void generateBill() {
        int unitsConsumed = getUnitsConsumed();
        double billAmount;

        if (connectionType.equalsIgnoreCase("domestic")) {
            billAmount = calculateDomesticBill(unitsConsumed);
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            billAmount = calculateCommercialBill(unitsConsumed);
        } else {
            System.out.println("Invalid connection type.");
            return;
        }

        // Display the bill details
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Gh. " + billAmount);
    }
}

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Consumer details
        System.out.print("Enter Consumer No: ");
        int consumerNo = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int prevMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currMonthReading = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter Type of EB Connection (domestic/commercial): ");
        String connectionType = scanner.nextLine();

        // Create an instance of the ElectricityBill class
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, prevMonthReading, currMonthReading, connectionType);

        // Generate the bill
        bill.generateBill();
    }
}
