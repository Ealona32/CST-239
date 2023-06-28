package app;

/**
 * The Health class represents a type of salable product that provides healing points.
 * It extends the SalableProduct class.
 */
public class Health extends SalableProduct {
    private int healingPoints;

    /**
     * Constructs a Health object with the specified name, description, price, quantity, and healing points.
     *
     * @param name           the name of the health item
     * @param description    the description of the health item
     * @param price          the price of the health item
     * @param quantity       the quantity of the health item available
     * @param healingPoints  the healing points provided by the health item
     */
    public Health(String name, String description, double price, int quantity, int healingPoints) {
        super(name, description, price, quantity);
        this.healingPoints = healingPoints;
    }

    /**
     * Returns the healing points provided by the health item.
     *
     * @return the healing points
     */
    public int getHealingPoints() {
        return healingPoints;
    }

    /**
     * Sets the healing points provided by the health item.
     *
     * @param healingPoints the healing points to set
     */
    public void setHealingPoints(int healingPoints) {
        this.healingPoints = healingPoints;
    }
}
