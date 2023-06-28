package app;

/**
 * The Armor class represents a type of salable product that provides defense points and has durability.
 * It extends the SalableProduct class.
 */
public class Armor extends SalableProduct {
    private int defensePoints;
    private int durability;

    /**
     * Constructs an Armor object with the specified name, description, price, quantity, and defense points.
     *
     * @param name           the name of the armor
     * @param description    the description of the armor
     * @param price          the price of the armor
     * @param quantity       the quantity of the armor available
     * @param defensePoints  the defense points provided by the armor
     */
    public Armor(String name, String description, double price, int quantity, int defensePoints) {
        super(name, description, price, quantity);
        this.defensePoints = defensePoints;
    }

    /**
     * Returns the defense points provided by the armor.
     *
     * @return the defense points
     */
    public int getDefensePoints() {
        return defensePoints;
    }

    /**
     * Sets the defense points provided by the armor.
     *
     * @param defensePoints the defense points to set
     */
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    /**
     * Returns the durability of the armor.
     *
     * @return the durability
     */
    public int getDurability() {
        return durability;
    }

    /**
     * Sets the durability of the armor.
     *
     * @param durability the durability to set
     */
    public void setDurability(int durability) {
        this.durability = durability;
    }
}
