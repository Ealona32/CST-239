package app;

/**
 * The CartItem class represents an item in the shopping cart.
 */
public class CartItem {
    private SalableProduct product;
    private int quantity;

    /**
     * Constructs a CartItem with the given product and quantity.
     *
     * @param product  The product to add to the cart.
     * @param quantity The quantity of the product in the cart.
     */
    public CartItem(SalableProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Gets the product in the cart item.
     *
     * @return The product in the cart item.
     */
    public SalableProduct getProduct() {
        return product;
    }

    /**
     * Sets the product in the cart item.
     *
     * @param product The new product to set.
     */
    public void setProduct(SalableProduct product) {
        this.product = product;
    }

    /**
     * Gets the quantity of the product in the cart item.
     *
     * @return The quantity of the product in the cart item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product in the cart item.
     *
     * @param quantity The new quantity to set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the total price of the cart item.
     *
     * @return The total price of the cart item.
     */
    public double calculateItemTotalPrice() {
        return product.calculateTotalPrice(quantity);
    }
}
