package app;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class StoreFront {
    private String storeName;
    private InventoryManager inventory;
    private ShoppingCart cart;

    public StoreFront(String storeName) {
        this.storeName = storeName;
        this.inventory = new InventoryManager();
        this.cart = new ShoppingCart();
    }

    public void initializeStore() {
        // Perform store initialization logic
        // For demonstration purposes, let's add some products to the inventory
        SalableProduct product1 = new SalableProduct("Product 1", "Description 1", 10.99f, 5);
        SalableProduct product2 = new SalableProduct("Product 2", "Description 2", 19.99f, 8);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
    }

    public void purchaseProduct(SalableProduct salableProduct) {
        if (inventory.getQuantity(salableProduct) > 0) {
            cart.addProduct(salableProduct);
            inventory.removeProduct(salableProduct);
            System.out.println("Product purchased: " + salableProduct.getName());
        } else {
            System.out.println("Product is out of stock.");
        }
    }

    public void cancelPurchase(SalableProduct salableProduct) {
        cart.removeProduct(salableProduct);
        inventory.addProduct(salableProduct);
        System.out.println("Purchase canceled: " + salableProduct.getName());
    }	

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
