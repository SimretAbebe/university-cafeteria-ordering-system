import java.util.ArrayList;
import java.util.List;

public class Order {

    // Private attributes
    private String orderId;
    private List<FoodItem> orderedItems; // Association: Order uses FoodItem objects

    
    public Order(String orderId) {
        this.orderId = orderId;
        this.orderedItems = new ArrayList<>();
    }
    public String getOrderId() {
        return orderId;
    }

   
    public void addItem(FoodItem foodItem) {
        orderedItems.add(foodItem);
        System.out.println(foodItem.getName() + " added to order " + orderId);
    }

    
    public double calculateTotal() {
        double total = 0.0;
        for (FoodItem item : orderedItems) {
            total += item.getPrice(); // Interacting with FoodItem objects
        }
        return total;
    }

   
    public int getItemCount() {
        return orderedItems.size();
    }

    /**
     * Displays the order details in a formatted way
     * Demonstrates object interaction: Order uses FoodItem's toString method
     */
    public void displayOrder() {
        System.out.println("\n=== Order Details ===");
        System.out.println("Order ID: " + orderId);

        if (orderedItems.isEmpty()) {
            System.out.println("No items in order.");
        } else {
            System.out.println("Items:");
            for (int i = 0; i < orderedItems.size(); i++) {
                System.out.println((i + 1) + ". " + orderedItems.get(i).toString());
            }

            System.out.println("Total Items: " + getItemCount());
            System.out.printf("Total Price: $%.2f\n", calculateTotal());
        }
        System.out.println("=====================");
    }

    /**
     * Clears all items from the order
     */
    public void clearOrder() {
        orderedItems.clear();
        System.out.println("Order " + orderId + " has been cleared.");
    }
}
