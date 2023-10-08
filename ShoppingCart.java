package app;

import java.util.ArrayList;
import java.util.List;

/**
 * The ShoppingCart class represents a shopping cart that holds items to be purchased.
 */
public class ShoppingCart {
    private List<CartItem> items;

    /**
     * Constructs an empty ShoppingCart.
     */
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    /**
     * Adds a CartItem to the shopping cart.
     *
     * @param item The CartItem to add.
     */
    public void addItem(CartItem item) {
        items.add(item);
    }

    /**
     * Removes a CartItem from the shopping cart.
     *
     * @param item The CartItem to remove.
     */
    public void removeItem(CartItem item) {
        items.remove(item);
    }

    /**
     * Returns the items in the shopping cart.
     *
     * @return A list of CartItems in the shopping cart.
     */
    public List<CartItem> getItems() {
        return items;
    }

    /**
     * Calculates the total price of items in the shopping cart.
     *
     * @return The total price of items in the shopping cart.
     */
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (CartItem item : items) {
            totalPrice += item.calculateItemTotalPrice();
        }
        return totalPrice;
    }
}
