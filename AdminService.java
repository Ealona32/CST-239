package app;

/**
 * The AdminService class represents the Administration Service that processes commands.
 */
public class AdminService {
    private InventorySystem inventorySystem;
    private FileServer fileServer;

    /**
     * Constructs an AdminService instance with an InventorySystem and FileServer.
     */
    public AdminService() {
        this.inventorySystem = new InventorySystem();
        this.fileServer = new FileServer("inventory_data.json");
    }

    /**
     * Processes the "U" command to update the inventory.
     * @param jsonPayload JSON payload containing new Salable Products.
     */
    public void processCommandU(String jsonPayload) {
        // Parse the JSON payload and update the inventory
        inventorySystem.updateInventory(jsonPayload);

        // Save the updated inventory to the file server
        fileServer.writeInventory(inventorySystem.getInventory());
    }

    /**
     * Processes the "R" command to retrieve all salable products from the inventory.
     * @return JSON representation of all products in the inventory.
     */
    public String processCommandR() {
        // Retrieve all salable products from the inventory
        String jsonResult = inventorySystem.getAllProductsAsJson();
        return jsonResult;
    }
}
