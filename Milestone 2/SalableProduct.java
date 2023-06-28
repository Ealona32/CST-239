package app;

/**
 * The SalableProduct class represents a product that can be sold.
 */
public class SalableProduct {
    private String name;
    private String description;
    private double price;
    private int quantity;

    /**
     * Constructs a SalableProduct object with the specified name, description, price, and quantity.
     *
     * @param name        the name of the product
     * @param description the description of the product
     * @param price       the price of the product
     * @param quantity    the quantity of the product available
     */
    public SalableProduct(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Returns the name of the product.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the description of the product.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the product.
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the price of the product.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the quantity of the product available.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product available.
     *
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Decreases the quantity of the product by the specified amount.
     *
     * @param amount the amount to decrease the quantity by
     */
    public void decreaseQuantity(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        }
    }

    /**
     * Increases the quantity of the product by the specified amount.
     *
     * @param amount the amount to increase the quantity by
     */
    public void increaseQuantity(int amount) {
        quantity += amount;
    }
}

