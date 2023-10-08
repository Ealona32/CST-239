package app;
//For JSON.simple
import org.json.simple.JSONObject;

//For JUnit
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;



public class FileServiceTest<JSONObject> {
    private FileService fileService;

    @Before
    public void setUp() {
        // Provide the path to a test JSON file
        fileService = new FileService("test.json");
    }

    @Test
    public void testReadJsonFile() throws IOException {
        // Create a sample JSON object
        JSONObject testData = new JSONObject();
        ((Object) testData).put("key", "value");

        // Write the JSON object to the test file
        fileService.writeJsonFile(testData);

        // Read the JSON data from the file
        JSONObject readData = fileService.readJsonFile();

        // Check if the read data matches the original data
        assertEquals(testData.toString(), readData.toString());
    }

    @Test
    public void testWriteJsonFile() throws IOException {
        // Create a  JSON object
        JSONObject testData = new JSONObject();
        testData.put("laptop", "49.99");

        // Write the JSON object to the test file
        fileService.writeJsonFile(testData);

        // Read the JSON data from the file
        JSONObject readData = fileService.readJsonFile();
    }
}

        // Check if the read data matches the original data
       
