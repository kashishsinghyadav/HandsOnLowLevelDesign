import java.util.*;

public class Foodorderingmain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        RestaurantService restaurantService = new RestaurantService();
        CatalogService catalogService = new CatalogService();
        OrderService orderService = new OrderService();

        // ===== Register Users =====
        String userId1 = userService.registerUser("Kashish Singh", "kashish@mail.com", "1234567890");
        String userId2 = userService.registerUser("Kridhna", "kridhna@mail.com", "9999999999");

        // ===== Register Restaurants =====
        String restId1 = restaurantService.registerRestaurant("Radhe Krishna Sweets", "GST12345", "radheshyam@mail.com", "9876543210");
        String restId2 = restaurantService.registerRestaurant("Haldiram", "GST67890", "haldiram@mail.com", "9988776655");

        // ===== Add Items to Restaurant 1 =====
        restaurantService.addItem(restId1, "Kaju Katli", 100.0, 4);
        restaurantService.addItem(restId1, "Makkan", 250.0, 2);
        restaurantService.addItem(restId1, "Lassi", 50.0, 10);

        // ===== Add Items to Restaurant 2 =====
        restaurantService.addItem(restId2, "Samosa", 20.0, 50);
        restaurantService.addItem(restId2, "Jalebi", 40.0, 30);
        restaurantService.addItem(restId2, "Rasgulla", 60.0, 20);

        // ===== Search Item in Restaurant 1 =====
        System.out.println("\n-- Search Kaju Katli in Radhe Krishna Sweets --");
        List<Item> searchResults1 = catalogService.searchItem(restId1, "Kaju Katli");
        searchResults1.forEach(i -> System.out.println(i.getName() + " " + i.getPrice() + " " + i.getQuantity()));

        // ===== Search Item in Restaurant 2 =====
        System.out.println("\n-- Search Jalebi in Haldiram --");
        List<Item> searchResults2 = catalogService.searchItem(restId2, "Jalebi");
        searchResults2.forEach(i -> System.out.println(i.getName() + " " + i.getPrice() + " " + i.getQuantity()));

        // ===== Place Orders with Payment Strategies =====
        String orderId1 = orderService.placeOrder(userId1, restId1, "Kaju Katli", 2, new CreditCardPayment("1234567812345678"));
        String orderId2 = orderService.placeOrder(userId2, restId2, "Jalebi", 5, new UPIPayment("kridhna@upi"));
        String orderId3 = orderService.placeOrder(userId1, restId2, "Rasgulla", 3, new CashOnDeliveryPayment());

        // ===== Get Orders for User 1 =====
        System.out.println("\n-- Orders for Kashish --");
        orderService.getOrders(userId1).forEach(o -> System.out.println(o.getOrderId() + " " + o.getStatus()));

        // ===== Cancel an Order =====
        orderService.cancelOrder(orderId1);

        // ===== Get Orders again for User 1 after cancellation =====
        System.out.println("\n-- Orders for Kashish after cancellation --");
        orderService.getOrders(userId1).forEach(o -> System.out.println(o.getOrderId() + " " + o.getStatus()));

        // ===== Get Orders for User 2 (Kridhna) =====
        System.out.println("\n-- Orders for Kridhna --");
        orderService.getOrders(userId2).forEach(o -> System.out.println(o.getOrderId() + " " + o.getStatus()));

        
        // ===== Try cancelling same order again =====
        orderService.cancelOrder(orderId1);
    }
}
