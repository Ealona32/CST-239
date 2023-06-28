package app; 
import java.util.ArrayList;
import java.util.List;

public class StoreFrontApplication {
    public static void main(String[] args) {
        StoreFront storeFront = new StoreFront("My Store");
        storeFront.initializeStore();

        SalableProduct product1 = new SalableProduct("Product 1", "Description 1", 10.99f, 5);
        SalableProduct product2 = new SalableProduct("Product 2", "Description 2", 19.99f, 8);

        storeFront.purchaseProduct(product1);
        storeFront.purchaseProduct(product2);

        storeFront.displayCart();

        storeFront.cancelPurchase(product1);

        storeFront.displayCart();
    }
}