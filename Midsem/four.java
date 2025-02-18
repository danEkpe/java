// Employee Class
class Employee {
    String empName;
    String empId;
    String address;
    String mailId;
    String mobileNo;
    double basicPay;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public double calculateDA() {
        return 0.97 * basicPay;
    }

    public double calculateHRA() {
        return 0.10 * basicPay;
    }

    public double calculatePF() {
        return 0.12 * basicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    public double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF() - calculateStaffClubFund();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Email: " + mailId);
        System.out.println("Mobile: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + calculateDA());
        System.out.println("HRA: " + calculateHRA());
        System.out.println("PF: " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("-----------------");
    }
}

// Inherited Classes
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Employee {
    public Professor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Main Application
public class PayrollSystem {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", "P001", "123 Street, City", "john.doe@example.com", "1234567890", 5000);
        AssistantProfessor assistantProfessor = new AssistantProfessor("Jane Smith", "A001", "456 Avenue, City", "jane.smith@example.com", "0987654321", 6000);
        AssociateProfessor associateProfessor = new AssociateProfessor("Mike Johnson", "AP001", "789 Boulevard, City", "mike.johnson@example.com", "1122334455", 7000);
        Professor professor = new Professor("Emily Davis", "PR001", "101 Parkway, City", "emily.davis@example.com", "2233445566", 8000);

        System.out.println("--- Pay Slips ---");
        programmer.generatePaySlip();
        assistantProfessor.generatePaySlip();
        associateProfessor.generatePaySlip();
        professor.generatePaySlip();
    }
}
