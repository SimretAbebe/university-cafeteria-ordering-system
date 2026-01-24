import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== University Cafeteria Ordering System ===\n");

        // 1. Create cafeterias
        System.out.println("1. Setting up cafeterias:");
        Cafeteria cafeteria1 = new Cafeteria("Tigi shiro bete");
        Cafeteria cafeteria2 = new Cafeteria("Eden mgb bete");
        Cafeteria cafeteria3 = new Cafeteria("Yeab Yemegbe Meade");

        // 2. Add food items
        System.out.println("\n2. Adding food items:");

        cafeteria1.addFoodItem(new FoodItem("Tea", 20));
        cafeteria1.addFoodItem(new FoodItem("Shiro", 120));

        cafeteria2.addFoodItem(new FoodItem("Injera with Tibs", 230));
        cafeteria2.addFoodItem(new FoodItem("Ertebe", 80));

        cafeteria3.addFoodItem(new FoodItem("Tastey Soya", 100));
        cafeteria3.addFoodItem(new FoodItem("Coffee", 25));

        // 3. Create student
        System.out.println("\n3. Creating student:");
        Student student = new Student("S001", "Mr.X", "mrx@bdu.edu.et", "BDU024001");
        System.out.println("Student created: " + student.getName() +
                " (ID: " + student.getStudentId() + ")");

        // 4. Student chooses cafeteria
        System.out.println("\n Choose Cafeteria:");
        System.out.println("1. Tigi shiro bete");
        System.out.println("2. Eden mgb bete");
        System.out.println("3. Yeab Yemegbe Meade");
        System.out.print("Enter choice (1-3): ");

        int cafChoice = scanner.nextInt();
        Cafeteria chosenCafeteria;

        if (cafChoice == 1) {
            chosenCafeteria = cafeteria1;
        } else if (cafChoice == 2) {
            chosenCafeteria = cafeteria2;
        } else {
            chosenCafeteria = cafeteria3;
        }

        System.out.println("\nStudent chooses: " + chosenCafeteria.getCafeteriaName());
        chosenCafeteria.displayMenu();

        // 5. Place order
        System.out.println("\n5. Student places an order:");
        Order order = new Order("ORD001");

        System.out.print("How many items do you want to order? ");
        int itemCount = scanner.nextInt();

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Select food item number: ");
            int itemIndex = scanner.nextInt() - 1;

            FoodItem item = chosenCafeteria.getFoodItem(itemIndex);
            if (item != null) {
                order.addItem(item);
            } else {
                System.out.println("Invalid selection.");
            }
        }

        // 6. Order summary
        System.out.println("\n6. Order summary:");
        order.displayOrder();

        // 7. Payment
        System.out.println("\n7. Processing payment:");
        Payment paymentMethod = new CashPayment(); // Polymorphism

        double totalAmount = order.calculateTotal();
        boolean paymentSuccess = paymentMethod.processPayment(totalAmount);

        if (paymentSuccess) {
            System.out.println("\nOrder completed successfully!");
            System.out.println("Student " + student.getName() + " paid $" +
                    String.format("%.2f", totalAmount) +
                    " using " + paymentMethod.getPaymentMethod());
        } else {
            System.out.println("\nPayment failed. Order cancelled.");
        }

        System.out.println("\n=== System Complete ===");
        scanner.close();
    }
}
