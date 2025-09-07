package wednesdayJava;

import java.util.Scanner;

class Restaurant {
    String restaurantName; // Each restaurant has its own name
    String lastOrderedItem; // Each restaurant only remembers its last order
    static int totalOrders = 0;
    Shared across
    all restaurants

    Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    // Method to place an order
    public void placeOrder(String itemName, int quantity) {
        this.lastOrderedItem = itemName;
        totalOrders += quantity;
        System.out.println("\n✅ Order placed successfully!");
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Last Ordered Item: " + lastOrderedItem);
        System.out.println("Orders in this transaction: " + quantity);
        System.out.println("Total Orders across Zomato: " + totalOrders);
        System.out.println("-----------------------------------");
    }
}

public class ZomatoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of restaurants
        System.out.print("Enter number of restaurants to register: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create restaurants
        Restaurant[] restaurants = new Restaurant[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of restaurant " + (i + 1) + ": ");
            String name = sc.nextLine();
            restaurants[i] = new Restaurant(name);
        }

        // Take orders
        char choice;
        do {
            System.out.println("\nAvailable Restaurants:");
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + restaurants[i].restaurantName);
            }

            System.out.print("Choose restaurant (1-" + n + "): ");
            int restChoice = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter item name: ");
            String item = sc.nextLine();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            // Place order
            restaurants[restChoice - 1].placeOrder(item, qty);

            System.out.print("Do you want to place another order? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("\n📌 Final Total Orders across Zomato: " + Restaurant.totalOrders);
    }
}
