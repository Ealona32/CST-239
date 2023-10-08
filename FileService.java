package app;

import com.fasterxml.jackson.databind.util.JSONPObject;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 * The FileService class provides methods for reading and writing JSON data.
 */
public class FileService {
    private String filePath;

    public FileService(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Reads JSON data from the specified file.
     *
     * @return A JSONObject containing the read data.
     * @throws IOException If an I/O error occurs.
     */
    public JSONPObject readJsonFile() throws IOException {
        String jsonData = new String(Files.readAllBytes(Paths.get(filePath)));
        return new JSONPObject(jsonData, jsonData);
    }

    /**
     * Writes JSON data to the specified file.
     *
     * @param jsonData The JSON data to write.
     * @throws IOException If an I/O error occurs.
     */
    public void writeJsonFile(JSONObject jsonData) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(jsonData.toString());
        }
    }
}
