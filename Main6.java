class Book {
    String title, author;
    double price;
    boolean available;

    // Default constructor
    Book() {
        this("Unknown", "Unknown", 0.0, true);
    }

    // Parameterized constructor
    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is not available: " + title);
        }
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + available);
    }
}

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Display circle details
    void display() {
        System.out.println("Circle Radius: " + radius);
    }
}

class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class HotelBooking {
    String guestName, roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display booking details
    void display() {
        System.out.println("Guest: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }
}

class CarRental {
    String customerName, carModel;
    int rentalDays;
    double dailyRate = 50.0; // Assuming a fixed daily rate

    // Default constructor
    CarRental() {
        this("Unknown", "Standard", 1);
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental details
    void display() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }
}

public class Main6 {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "John Doe", 29.99, true);
        
        // Display book details
        book1.display();
        book2.display();
        
        // Borrow a book
        book2.borrowBook();
        book2.display();

        // Creating circle objects
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        
        // Display circle details
        circle1.display();
        circle2.display();

        // Creating person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person(person1); // Cloning person1
        
        // Display person details
        person1.display();
        person2.display();

        // Creating hotel bookings
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("John Smith", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2); // Copying booking2
        
        // Display booking details
        booking1.display();
        booking2.display();
        booking3.display();

        // Creating car rentals
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Emily Johnson", "SUV", 5);
        
        // Display rental details
        rental1.display();
        rental2.display();
    }
}