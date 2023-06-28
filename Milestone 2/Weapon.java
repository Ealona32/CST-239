package app;

/**
 * The Weapon class represents a weapon product.
 */
 public class Weapon extends SalableProduct {
    private int attackDamage;

    /**
     * Constructs a Weapon object with the specified name, description, price, quantity, attack damage, and durability.
     *
     * @param name         the name of the weapon
     * @param description  the description of the weapon
     * @param price        the price of the weapon
     * @param quantity     the quantity of the weapon available
     * @param attackDamage the attack damage of the weapon
     */
    public Weapon(String name, String description, double price, int quantity, int attackDamage) {
        super(name, description, price, quantity);
        this.attackDamage = attackDamage;
    }

    /**
     * Returns the attack damage of the weapon.
     *
     * @return the attack damage
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * Sets the attack damage of the weapon.
     *
     * @param attackDamage the attack damage to set
     */
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
