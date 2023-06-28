
package app;

import java.util.ArrayList;
import java.util.List;

/**
 * The InventoryManager class is responsible for managing a collection of salable products.
 */
public class InventoryManager {

    /**
     * The list of salable products in the inventory.
     */
    private List<SalableProduct> products;

    /**
     * Constructs a new InventoryManager object with an empty product list.
     */
    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    /**
     * Adds a salable product to the inventory.
     *
     * @param salableProduct the salable product to be added
     */
    public void addProduct(SalableProduct salableProduct) {
        products.add(salableProduct);
    }

    /**
     * Removes a salable product from the inventory.
     *
     * @param salableProduct the salable product to be removed
     */
    public void removeProduct(SalableProduct salableProduct) {
        products.remove(salableProduct);
    }

    /**
     * Retrieves the quantity of a specific salable product in the inventory.
     *
     * @param salableProduct the salable product to retrieve the quantity for
     * @return the quantity of the specified product, or 0 if not found
     */
    public int getQuantity(SalableProduct salableProduct) {
        for (SalableProduct product : products) {
            if (product.getName().equals(salableProduct.getName())) {
                return product.getQuantity();
            }
        }
        return 0;
    }

    /**
     * Retrieves a list of all salable products in the inventory.
     *
     * @return a list of all salable products in the inventory
     */
    public List<SalableProduct> getAllProducts() {
        return products;
    }

    /**
     * Retrieves a salable product from the inventory based on its name.
     *
     * @param name the name of the product to retrieve
     * @return the salable product with the specified name, or null if not found
     */
    public SalableProduct getProductByName(String name) {
        for (SalableProduct product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Checks if a salable product is in stock.
     *
     * @param salableProduct the salable product to check
     * @return true if the product is in stock, false otherwise
     */
    public boolean isProductInStock(SalableProduct salableProduct) {
        return getQuantity(salableProduct) > 0;
    }
}
