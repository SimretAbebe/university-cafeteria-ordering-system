public class Staff extends User {

    // Staff-specific attribute
    private String employeeId;

  
    public Staff(String userId, String name, String email, String employeeId) {
        super(userId, name, email); // Call parent class constructor
        this.employeeId = employeeId;
    }

   
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Implementation of the abstract performAction method from User class.
     * This method defines what action staff performs in the system.
     * Overrides the abstract method to provide staff-specific behavior.
     */
    @Override
    public void performAction() {
        System.out.println("Staff " + getName() + " (Employee ID: " + employeeId + ") is managing the cafeteria...");
        // Staff-specific actions
        manageOrders();
        processPayment();
    }

    /**
     * Staff-specific method to manage customer orders
     */
    public void manageOrders() {
        System.out.println("Managing customer orders...");
    }

    /**
     * Staff-specific method to process payments
     */
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}
