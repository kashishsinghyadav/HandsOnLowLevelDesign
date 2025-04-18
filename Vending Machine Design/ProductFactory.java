public class ProductFactory {
    public static Product createProduct(String type, int quantity) {
        return switch (type.toLowerCase()) {
            case "drink" -> new Drink(quantity);
            case "chocolate" -> new Chocolate(quantity);
            case "cookie" -> new Cookie(quantity);
            default -> null;
        };
    }
}

