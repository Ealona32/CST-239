package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents a Store Front Application that allows users to purchase and cancel products.
 */
public class StoreFrontApplication {
    private List<SalableProduct> inventory;

    /**
     * Constructs a StoreFrontApplication object with an empty inventory.
     */
    public StoreFrontApplication() {
        inventory = new ArrayList<>();
    }

    /**
     * Populates the inventory with hard-coded initial products.
     */
    public void populateInventory() {
        // Hard-code the initial inventory
        Weapon weapon1 = new Weapon("Sword", "A powerful sword", 50.0, 5, 10);
        Weapon weapon2 = new Weapon("Bow", "A long-range bow", 40.0, 3, 8);
        Armor armor1 = new Armor("Helmet", "A protective helmet", 30.0, 2, 5);
        Armor armor2 = new Armor("Chestplate", "A sturdy chestplate", 60.0, 4, 10);
        Health health = new Health("Potion", "A healing potion", 10.0, 10, 20);

        inventory.add(weapon1);
        inventory.add(weapon2);
        inventory.add(armor1);
        inventory.add(armor2);
        inventory.add(health);
    }

    /**
     * Attempts to purchase a product from the inventory.
     *
     * @param product the product to purchase
     * @return true if the purchase is successful, false otherwise
     */
    public boolean purchaseProduct(SalableProduct product) {
        for (SalableProduct item : inventory) {
            if (item.equals(product)) {
                if (item.getQuantity() > 0) {
                    item.decreaseQuantity(1);
                    System.out.println("Product purchased successfully.");
                    return true;
                } else {
                    System.out.println("Product is out of stock.");
                    return false;
                }
            }
        }

        System.out.println("Product not found in inventory.");
        return false;
    }

    /**
     * Cancels a product by increasing its quantity in the inventory.
     *
     * @param product the product to cancel
     * @return true if the cancellation is successful, false otherwise
     */
    public boolean cancelProduct(SalableProduct product) {
        for (SalableProduct item : inventory) {
            if (item.equals(product)) {
                item.increaseQuantity(1);
                System.out.println("Product canceled successfully.");
                return true;
            }
        }

        System.out.println("Product not found in inventory.");
        return false;
    }

    /**
     * Displays a welcome message to the user.
     */
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Store Front!");
    }

    /**
     * Displays the available actions to the user.
     */
    public void displayActions() {
        System.out.println("Please select an action:");
        System.out.println("1. Purchase a product");
        System.out.println("2. Cancel a product");
        System.out.println("3. Exit");
    }

    /**
     * Executes the chosen action based on the user's input.
     *
     * @param choice the user's choice
     */
    public void executeAction(int choice) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("Enter the name of the product to purchase:");
                String productName = scanner.nextLine();

                SalableProduct productToPurchase = findProductByName(productName);
                if (productToPurchase != null) {
                    purchaseProduct(productToPurchase);
                } else {
                    System.out.println("Product not found.");
                }
                break;
            case 2:
                System.out.println("Enter the name of the product to cancel:");
                String cancelProductName = scanner.nextLine();

                SalableProduct productToCancel = findProductByName(cancelProductName);
                if (productToCancel != null) {
                    cancelProduct(productToCancel);
                } else {
                    System.out.println("Product not found.");
                }
                break;
            case 3:
                System.out.println("Exiting Store Front. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    /**
     * Finds a product in the inventory based on its name.
     *
     * @param name the name of the product to find
     * @return the found product if it exists, null otherwise
     */
    private SalableProduct findProductByName(String name) {
        for (SalableProduct product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Runs the Store Front application.
     */
    public void runStoreFront() {
        displayWelcomeMessage();
        populateInventory();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayActions();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            executeAction(choice);
            System.out.println(); // Add a new line for separation
        }
    }

    /**
     * The entry point of the Store Front application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StoreFrontApplication storeFront = new StoreFrontApplication();
        storeFront.runStoreFront();
    }
}
