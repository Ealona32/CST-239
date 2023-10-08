package app;
import java.util.List;


/**
 * The StoreFront class represents an online store's front-end.
 */
public class StoreFront {
    private InventoryManager inventoryManager;
    private ShoppingCart shoppingCart;

    /**
     * Constructs a StoreFront with an associated InventoryManager and ShoppingCart.
     *
     * @param inventoryManager The InventoryManager to manage product inventory.
     * @param shoppingCart     The ShoppingCart to store items for purchase.
     */
    public StoreFront(InventoryManager inventoryManager, ShoppingCart shoppingCart) {
        this.inventoryManager = inventoryManager;
        this.shoppingCart = shoppingCart;
    }

    /**
     * Adds a product to the shopping cart.
     *
     * @param product  The SalableProduct to add to the cart.
     * @param quantity The quantity of the product to add.
     */
    public void addToCart(SalableProduct product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        shoppingCart.addItem(cartItem);
    }

    /**
     * Removes a product from the shopping cart.
     *
     * @param product The SalableProduct to remove from the cart.
     */
    public void removeFromCart(SalableProduct product) {
        CartItem cartItem = new CartItem(product, 0); // Remove all instances of the product
        shoppingCart.removeItem(cartItem);
    }

    /**
     * Retrieves the products available in the store's inventory.
     *
     * @return A list of SalableProduct objects representing the available inventory.
     */
    public List<SalableProduct> viewInventory() {
        return inventoryManager.getInventory();
    }

    /**
     * Retrieves the items in the shopping cart.
     *
     * @return A list of CartItem objects in the shopping cart.
     */
    public List<CartItem> viewCart() {
        return shoppingCart.getItems();
    }

    /**
     * Calculates the total price of items in the shopping cart.
     *
     * @return The total price of items in the shopping cart.
     */
    public double calculateCartTotalPrice() {
        return shoppingCart.calculateTotalPrice();
    }
}
