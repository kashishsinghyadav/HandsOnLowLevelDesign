import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(String type, int quantity) {
        type = type.toLowerCase();
        if (products.containsKey(type)) {
            products.get(type).addQuantity(quantity);
        } else {
            Product product = ProductFactory.createProduct(type, quantity);
            products.put(type, product);
        }
    }
    public void reduceProduct(String type){
        type = type.toLowerCase();
        if (products.containsKey(type)) {
            Product product = products.get(type);
            if (product.getQuantity() > 0) {
                product.reduceQuantity(1);
            }
        }
    }
    public Product getProduct(String type) {
        return products.get(type.toLowerCase());
    }
    public void printInventory() {
        for (Product product : products.values()) {
            System.out.println(product.getName() + " - Qty: " + product.getQuantity() + " - ₹" + product.getPrice());
        }
    }
}
