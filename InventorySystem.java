package app;

import java.util.HashMap;
import java.util.Map;

/**
 * The InventorySystem class represents the inventory management system.
 */
public class InventorySystem {
    private Map<String, String> inventory;

    /**
     * Constructs an InventorySystem with an empty inventory.
     */
    public InventorySystem() {
        this.inventory = new HashMap<>();
    }

    /**
     * Updates the inventory based on the JSON payload.
     * @param jsonPayload JSON payload containing updates to the inventory.
     */
    public void updateInventory(String jsonPayload) {
        try {
            // Parse the JSON payload
            JSONObject jsonObject = new JSONObject(jsonPayload);

            // Iterate over the keys (product IDs) in the JSON object and update the inventory
            for (String productId : jsonObject.keySet()) {
                String productDetails = jsonObject.getString(productId);
                inventory.put(productId, productDetails);
            }
        } catch (Exception e) {
            // Handle JSON parsing exceptions
            e.printStackTrace();
        }
    }

    /**
     * Gets the inventory.
     * @return The inventory as a map of product IDs to product details.
     */
    public Map<String, String> getInventory() {
        return inventory;
    }

    /**
     * Retrieves all products from the inventory as a JSON string.
     * @return JSON representation of all products in the inventory.
     */
    public String getAllProductsAsJson() {
        JSONObject jsonInventory = new JSONObject(inventory);
        return jsonInventory.toString();
    }
}
