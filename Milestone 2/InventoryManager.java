package app;

import java.util.ArrayList;
import java.util.List;

/**
 * The InventoryManager class manages the inventory of salable products.
 */
public class InventoryManager {
    private List<SalableProduct> products;

    /**
     * Constructs an InventoryManager object and initializes the product list.
     */
    public InventoryManager() {
        products = new ArrayList<>();
        populateInventory();
    }

    /**
     * Populates the initial inventory with pre-defined products.
     */
    public void populateInventory() {
        // Add products to the inventory
    }

    /**
     * Adds a product to the inventory.
     *
     * @param product the product to add
     */
    public void addProduct(SalableProduct product) {
        products.add(product);
    }

    /**
     * Removes a product from the inventory.
     *
     * @param product the product to remove
     */
    public void removeProduct(SalableProduct product) {
        products.remove(product);
    }

    /**
     * Retrieves a product from the inventory based on its name.
     *
     * @param name the name of the product
     * @return the product with the specified name, or null if not found
     */
    public SalableProduct getProductByName(String name) {
		return null;
        // Search for the product by name
    }

    /**
     * Performs the purchase of a product from the inventory.
     * Reduces the quantity of the purchased product by 1.
     *
     * @param name the name of the product to purchase
     */
    public void purchaseProduct(String name) {
        // Perform the purchase logic
    }

    /**
     * Cancels a product from a purchase and restores its quantity by 1.
     *
     * @param name the name of the product to cancel
     */
    public void cancelProduct(String name) {
        // Perform the cancellation logic
    }
}
