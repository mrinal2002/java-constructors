public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks
    private double fee;
    
    // Class variable shared by all courses
    private static String instituteName = "Default Institute";
    
    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }
    
    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        Course.updateInstituteName("Tech Academy");
        
        Course c1 = new Course("Java Programming", 8, 299.99);
        Course c2 = new Course("Web Development", 12, 399.99);
        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
