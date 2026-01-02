import java.util.ArrayList;
public class Cafeteria {

    // Private attributes
    private String cafeteriaName;
    private ArrayList<FoodItem> menu; // Aggregation: Cafeteria contains FoodItem objects

 
    public Cafeteria(String cafeteriaName) {
        this.cafeteriaName = cafeteriaName;
        this.menu = new ArrayList<>(); // Initialize empty menu
    }

  
    public String getCafeteriaName() {
        return cafeteriaName;
    }

    
    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
        System.out.println(foodItem.getName() + " has been added to " + cafeteriaName + "'s menu.");
    }

    /**
     * Displays all food items in the cafeteria's menu
     */
    public void displayMenu() {
        System.out.println("\n=== " + cafeteriaName + " Menu ===");
        if (menu.isEmpty()) {
            System.out.println("Menu is currently empty.");
        } else {
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).toString());
            }
        }
        System.out.println("=====================================");
    }

  
    public FoodItem getFoodItem(int index) {
        if (index >= 0 && index < menu.size()) {
            return menu.get(index);
        }
        return null;
    }
    public int getMenuSize() {
        return menu.size();
    }
}
