package app;
//For JSON.simple


//For JUnit
import org.junit.Before;
import org.junit.Test;


/**
 * JUnit test class for the ElectronicProduct class.
 */
public class ElectronicProductTest {

    /**
     * Test the calculateExtendedWarrantyCost method.
     */
    @Test
    public void testCalculateExtendedWarrantyCost() {
        // ElectronicProduct object for testing
        ElectronicProduct product = new ElectronicProduct("Laptop", "Electronics", 100.0, 2, "Dell", 12);
        
        // Test the calculateExtendedWarrantyCost method
        double warrantyCost = product.calculateExtendedWarrantyCost();
        
        // Assert that the calculated warranty cost is correct
        assertEquals(0.0, warrantyCost, 0.01);
    }
}
