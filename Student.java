public class Student extends User {

    // Student-specific attribute
    private String studentId;


    public Student(String userId, String name, String email, String studentId) {
        super(userId, name, email); // Call parent class constructor
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    /** 
     * This method defines what action a student performs in the system.
     * Overrides the abstract method to provide student-specific behavior.
    */
    @Override
    public void performAction() {
        System.out.println("Student " + getName() + " (ID: " + studentId + ") is accessing the cafeteria system...");
        // Student-specific actions
        viewMenu();
        placeOrder();
    }

    /**
     * Student-specific method to view available food items
     */
    public void viewMenu() {
        System.out.println("Viewing cafeteria menu...");
    }

    /**
     * Student-specific method to place a food order
     */
    public void placeOrder() {
        System.out.println("Placing food order...");
    }
}
