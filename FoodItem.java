public class FoodItem {

    // Private attributes - encapsulated data
    private String name;
    private double price;

   
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

  
    public String getName() {
        return name;
    }

    
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", price);
    }
}
