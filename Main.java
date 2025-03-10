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

public class Main {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "John Doe", 29.99);
        
        // Display book details
        book1.display();
        book2.display();
    }
}
