public class Employee {
    // Instance variables
    public int employeeID;
    protected String department;
    private double salary;
    
    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Public method to access salary
    public double getSalary() {
        return salary;
    }
    
    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass demonstrating protected and public member access
class Manager extends Employee {
    private String teamName;
    
    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }
    
    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Team Name: " + teamName);
    }
    
    public static void main(String[] args) {
        Manager manager = new Manager(101, "IT", 75000.00, "Development Team");
        manager.displayEmployeeDetails();
        manager.displayManagerDetails();
    }
}
