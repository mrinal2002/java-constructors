public class Book {
    // Instance variables
    public String ISBN;
    protected String title;
    private String author;
    
    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    // Public method to access author
    public String getAuthor() {
        return author;
    }
    
    // Public method to modify author
    public void setAuthor(String author) {
        this.author = author;
    }
    
    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass demonstrating protected and public member access
class EBook extends Book {
    private double fileSize;
    
    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }
    
    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("File Size: " + fileSize + " MB");
    }
    
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Programming", "John Doe", 2.5);
        ebook.displayBookDetails();
        ebook.displayEBookDetails();
    }
}
