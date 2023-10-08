package app;

/**
 * Represents an electronic product that extends the SalableProduct class.
 */
public class ElectronicProduct extends SalableProduct {
    private String manufacturer;
    private int warrantyMonths;

    /**
     * Constructs an ElectronicProduct object with the specified attributes.
     *
     * @param name           The name of the electronic product.
     * @param description    The description of the electronic product.
     * @param price          The price of the electronic product.
     * @param quantity       The quantity of the electronic product available.
     * @param manufacturer   The manufacturer of the electronic product.
     * @param warrantyMonths The warranty period in months for the electronic product.
     */
    public ElectronicProduct(String name, String description, double price, int quantity, String manufacturer, int warrantyMonths) {
        super(name, description, price, quantity);
        this.manufacturer = manufacturer;
        this.warrantyMonths = warrantyMonths;
    }

    /**
     * Gets the manufacturer of the electronic product.
     *
     * @return The manufacturer name.
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer of the electronic product.
     *
     * @param manufacturer The manufacturer name to set.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the warranty period in months for the electronic product.
     *
     * @return The warranty period in months.
     */
    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    /**
     * Sets the warranty period in months for the electronic product.
     *
     * @param warrantyMonths The warranty period in months to set.
     */
    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    /**
     * Calculates the cost of an extended warranty for the electronic product.
     *
     * @return The cost of the extended warranty.
     */
    public double calculateExtendedWarrantyCost() {
                return 0.0; 
    }
}
