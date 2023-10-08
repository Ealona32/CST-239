package app;
//For JSON.simple
import org.json.simple.JSONObject;

//For JUnit
import org.junit.Before;
import org.junit.Test;


public class SalableProductTest {
    private SalableProduct product;

    @Before
    public void setUp() {
        product = new SalableProduct("CellPhone", "Electronics", 10.0, 5);
    }

    @Test
    public void testCalculateTotalPrice() {
        assertEquals(50.0, product.calculateTotalPrice(5), 0.01);
    }

    @Test
    public void testUpdateQuantity() {
        product.updateQuantity(3);
        assertEquals(3, product.getQuantity());
    }
}
