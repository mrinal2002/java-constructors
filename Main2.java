class Book {
    String title, author;
    double price;

    // Default constructor
    Book() {
        this("Unknown", "Unknown", 0.0);
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
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

public class Main2 {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "John Doe", 29.99);
        
        // Display book details
        book1.display();
        book2.display();

        // Creating circle objects
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        
        // Display circle details
        circle1.display();
        circle2.display();
    }
}
