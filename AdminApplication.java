package app;

/**
 * The AdminApplication class represents the Administration Application for sending commands.
 */
public class AdminApplication {
    /**
     * The main method simulates user interactions with the Admin Application.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Simulate user interactions
        AdminService adminService = new AdminService();

        // Define product details as JSON payload
        String jsonPayload = "{"
            + "\"product123\": \"Brand New Laptop\","
            + "\"product456\": \"Smartphone with 5G\","
            + "\"product789\": \"Wireless Bluetooth Earbuds\""
            + "}";

        // Simulate processing a "U" command to update the inventory
        adminService.processCommandU(jsonPayload);

        // Simulate processing an "R" command to retrieve salable products
        String result = adminService.processCommandR();
        System.out.println("Retrieved Salable Products:\n" + result);
    }
}