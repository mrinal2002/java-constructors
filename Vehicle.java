public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    
    // Class variable shared by all vehicles
    private static double registrationFee = 500.00;
    
    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    
    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(600.00);
        
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
