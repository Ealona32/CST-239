package app;

import java.util.ArrayList;
import java.util.List;

/**
 * The ShoppingCart class represents a shopping cart that holds a collection of salable products.
 */
public class ShoppingCart {

    /**
     * The list of products in the shopping cart.
     */
    private List<SalableProduct> products;

    /**
     * Constructs a new ShoppingCart object with an empty product list.
     */
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    /**
     * Adds a product to the shopping cart.
     *
     * @param product the product to be added
     */
    public void addProduct(SalableProduct product) {
        products.add(product);
    }

    /**
     * Removes a product from the shopping cart.
     *
     * @param product the product to be removed
     */
    public void removeProduct(SalableProduct product) {
        products.remove(product);
    }

    /**
     * Retrieves the list of products in the shopping cart.
     *
     * @return the list of products in the shopping cart
     */
    public List<SalableProduct> getProducts() {
        return products;
    }
}
