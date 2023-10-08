package app;

import java.util.ArrayList;
import java.util.List;

/**
 * The InventoryManager class manages the inventory of SalableProduct objects.
 */
public class InventoryManager {
    private List<SalableProduct> inventory;

    /**
     * Initializes an empty inventory.
     */
    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    /**
     * Initializes the inventory from a JSON file.
     *
     * @param filePath The path to the JSON file containing inventory data.
     */
    public void initializeInventoryFromJSON(String filePath) {
        
    }

    /**
     * Gets the current inventory.
     *
     * @return A list of SalableProduct objects representing the current inventory.
     */
    public List<SalableProduct> getInventory() {
        return inventory;
    }

    /**
     * Adds a product to the inventory.
     *
     * @param product The SalableProduct to be added to the inventory.
     */
    public void addProductToInventory(SalableProduct product) {
        inventory.add(product);
    }

    /**
     * Removes a product from the inventory.
     *
     * @param product The SalableProduct to be removed from the inventory.
     */
    public void removeProductFromInventory(SalableProduct product) {
        inventory.remove(product);
    }

    /**
     * Updates the quantity of a product in the inventory.
     *
     * @param product       The SalableProduct to be updated.
     * @param newQuantity   The new quantity of the product.
     */
    public void updateProductQuantity(SalableProduct product, int newQuantity) {
        
    }

	public void addProduct(SalableProduct product) {
	
		
	}
}
