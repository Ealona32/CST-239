package app;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 * The FileServer class represents a file server for reading and writing JSON data files.
 */
public class FileServer {
    private String filePath;

    /**
     * Constructs a FileServer with the specified file path.
     * @param filePath The path to the JSON data file.
     */
    public FileServer(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Writes the inventory to the JSON data file.
     * @param inventory The inventory to be written.
     */
    public void writeInventory(Map<String, String> inventory) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Convert the inventory to JSON and write it to the file
            JSONObject jsonInventory = new JSONObject(inventory);
            writer.write(jsonInventory.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads the JSON data from the file and returns it as a string.
     * @return The JSON data read from the file.
     */
    public String readInventory() {
        try {
            // Read the JSON data from the file and return it as a string
            byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
            return new String(jsonData);
        } catch (IOException e) {
            e.printStackTrace();
            return "{}"; // Return an empty JSON object in case of an error
        }
    }
}
