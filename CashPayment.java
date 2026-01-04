public class CashPayment implements Payment {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("\n=== Cash Payment Processing ===");

        // Validate amount
        if (amount <= 0) {
            System.out.println("Error: Invalid payment amount $" + String.format("%.2f", amount));
            return false;
        }

        // Simulate cash payment process
        System.out.println("Amount to pay: $" + String.format("%.2f", amount));
        System.out.println("Please provide cash to the cashier...");
        System.out.println("Cash received and counted...");
        System.out.println("Change calculated (if applicable)...");
        System.out.println("Payment completed successfully!");

        return true; 
    }
    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}
