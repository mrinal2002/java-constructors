public class Product {
    // Instance variables
    private String productName;
    private double price;
    
    // Class variable to keep track of total products
    private static int totalProducts = 0;
    
    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total product count whenever a new product is created
    }
    
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
    
    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Smartphone", 499.99);
        
        p1.displayProductDetails();
        p2.displayProductDetails();
        
        // Display total products created
        Product.displayTotalProducts();
    }
}
