public class Student {
    // Instance variables
    public int rollNumber;
    protected String name;
    private double CGPA;
    
    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    
    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }
    
    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    
    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass demonstrating protected member access
class PostgraduateStudent extends Student {
    private String researchTopic;
    
    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }
    
    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("Research Topic: " + researchTopic);
    }
    
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "John Doe", 3.8, "Artificial Intelligence");
        pgStudent.displayStudentDetails();
        pgStudent.displayPostgraduateDetails();
    }
}
