package app;

import java.util.List;
//For JSON.simple
import org.json.simple.JSONObject;

//For JUnit
import org.junit.Before;
import org.junit.Test;


class InventoryManagerTest {
    private InventoryManager inventoryManager;

    @Before
    void setUp() {
        inventoryManager = new InventoryManager();
    }

    @Test
    void testAddProduct() {
        SalableProduct product = new SalableProduct("Sample Product", "Description", 19.99, 10);
        inventoryManager.addProduct(product);
        List<SalableProduct> inventory = inventoryManager.getInventory();
        assertTrue(inventory.contains(product));
    }

    private void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void testRemoveProduct() {
        SalableProduct product = new SalableProduct("Sample Product", "Description", 19.99, 10);
        inventoryManager.addProduct(product);
        inventoryManager.removeProductFromInventory(product);
        List<SalableProduct> inventory = inventoryManager.getInventory();
        assertFalse(inventory.contains(product));
    }

	private void assertFalse(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
