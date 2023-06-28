package app;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * The StoreFront class represents a storefront that manages inventory and a shopping cart for purchasing products.
 */
public class StoreFront {

    /**
     * The name of the store.
     */
    private String storeName;

    /**
     * The inventory manager for managing product inventory.
     */
    private InventoryManager inventory;

    /**
     * The shopping cart for holding purchased products.
     */
    private ShoppingCart cart;

    /**
     * Constructs a new StoreFront object with the specified store name.
     *
     * @param storeName the name of the store
     */
    public StoreFront(String storeName) {
        this.storeName = storeName;
        this.inventory = new InventoryManager();
        this.cart = new ShoppingCart();
    }

    /**
     * Initializes the store with any necessary setup logic.
     * For demonstration purposes, this method adds some products to the inventory.
     */
    public void initializeStore() {
        // Perform store initialization logic
        // For demonstration purposes, let's add some products to the inventory
        SalableProduct product1 = new SalableProduct("Product 1", "Description 1", 10.99f, 5);
        SalableProduct product2 = new SalableProduct("Product 2", "Description 2", 19.99f, 8);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
    }

    /**
     * Purchases a product from the store.
     * If the product is in stock, it is added to the shopping cart and removed from the inventory.
     * If the product is out of stock, an appropriate message is displayed.
     *
     * @param salableProduct the product to purchase
     */
    public void purchaseProduct(SalableProduct salableProduct) {
        if (inventory.getQuantity(salableProduct) > 0) {
            cart.addProduct(salableProduct);
            inventory.removeProduct(salableProduct);
            System.out.println("Product purchased: " + salableProduct.getName());
        } else {
            System.out.println("Product is out of stock.");
        }
    }

    /**
     * Cancels the purchase of a product.
     * The product is removed from the shopping cart and added back to the inventory.
     *
     * @param salableProduct the product to cancel the purchase for
     */
    public void cancelPurchase(SalableProduct salableProduct) {
        cart.removeProduct(salableProduct);
        inventory.addProduct(salableProduct);
        System.out.println("Purchase canceled: " + salableProduct.getName());
    }

    /**
     * Displays the contents of the shopping cart.
     * The product name, price, and quantity are displayed for each item in the cart.
     */
    public void displayCart() {
        System.out.println("Shopping Cart:");
        List<SalableProduct> products = cart.getProducts();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (SalableProduct product : products) {
            String formattedPrice = decimalFormat.format(product.getPrice());
            System.out.println(" - " + product.getName() + " ($" + formattedPrice + ") - Quantity: " + product.getQuantity());
        }
    }
}
