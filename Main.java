public class Main {

    public static void main(String[] args) {
        System.out.println("=== University Cafeteria Ordering System ===\n");

        // 1. Create cafeterias
        System.out.println("1. Setting up cafeterias:");
        Cafeteria cafeteria1 = new Cafeteria("Tigi shiro bete");
        Cafeteria cafeteria2 = new Cafeteria("Eden mgb bete");
        Cafeteria cafeteria3 = new Cafeteria("Yeab Yemegbe Meade");

        // 2. Add food items to each cafeteria
        System.out.println("\n2. Adding food items:");

        // tigi shiro bete menu
        cafeteria1.addFoodItem(new FoodItem("Tea", 20));
        cafeteria1.addFoodItem(new FoodItem("Shiro", 120));

        // eden mgb bete menu
        cafeteria2.addFoodItem(new FoodItem("Injera with Tibs", 230));
        cafeteria2.addFoodItem(new FoodItem("Ertebe", 80));

        // Yeab Yemegbe Meade menu
        cafeteria3.addFoodItem(new FoodItem("Tastey Soya", 100));
        cafeteria3.addFoodItem(new FoodItem("Coffee", 25));

        // 3. Create a Student object
        System.out.println("\n3. Creating student:");
        Student student = new Student("S001", "Mr.X", "mrx@bdu.edu.et", "BDU024001");
        System.out.println("Student created: " + student.getName() + " (ID: " + student.getStudentId() + ")");

        // 4. Student chooses cafeteria and views menu
        System.out.println("\n4. Student chooses cafeteria and views menu:");
        Cafeteria chosenCafeteria = cafeteria3; // Student chooses Yeab Yemegbe Meade
        System.out.println("Student chooses: " + chosenCafeteria.getCafeteriaName());
        chosenCafeteria.displayMenu();

        // 5. Student places an order
        System.out.println("\n5. Student places an order:");
        Order order = new Order("ORD001");

        // Student selects food items (simulated selection)
        System.out.println("Student selects:");
        FoodItem item1 = chosenCafeteria.getFoodItem(0); // Tastey Soya
        FoodItem item2 = chosenCafeteria.getFoodItem(1); // Coffee

        if (item1 != null) order.addItem(item1);
        if (item2 != null) order.addItem(item2);

        // 6. Display order details and calculate total
        System.out.println("\n6. Order summary:");
        order.displayOrder();

        // 7. Process payment using polymorphism
        System.out.println("\n7. Processing payment:");
        Payment paymentMethod = new CashPayment(); // Polymorphism: Payment interface reference

        double totalAmount = order.calculateTotal();
        boolean paymentSuccess = paymentMethod.processPayment(totalAmount);

        if (paymentSuccess) {
            System.out.println("\n Order completed successfully!");
            System.out.println("Student " + student.getName() + " paid $" +
                             String.format("%.2f", totalAmount) + " using " +
                             paymentMethod.getPaymentMethod());
        } else {
            System.out.println("\n Payment failed. Order cancelled.");
        }

        System.out.println("\n=== System Demonstration Complete ===");
    }
}
