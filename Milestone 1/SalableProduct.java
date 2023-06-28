package app;

/**
 * The SalableProduct class represents a product that can be sold.
 */
public class SalableProduct {

    /**
     * The name of the product.
     */
    private String name;

    /**
     * The description of the product.
     */
    private String description;

    /**
     * The price of the product.
     */
    private float price;

    /**
     * The quantity of the product available.
     */
    private int quantity;

    /**
     * Constructs a new SalableProduct object with the specified properties.
     *
     * @param name        the name of the product
     * @param description the description of the product
     * @param price       the price of the product
     * @param quantity    the quantity of the product available
     */
    public SalableProduct(String name, String description, float price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name the name of the product to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the description of the product.
     *
     * @return the description of the product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the product.
     *
     * @param description the description of the product to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return the price of the product
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the price of the product to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Retrieves the quantity of the product available.
     *
     * @return the quantity of the product available
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product available.
     *
     * @param quantity the quantity of the product to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
