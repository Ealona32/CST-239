package app;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<SalableProduct> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(SalableProduct product) {
        products.add(product);
    }

    public void removeProduct(SalableProduct product) {
        products.remove(product);
    }

    public List<SalableProduct> getProducts() {
        return products;
    }
}
