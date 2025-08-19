import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OrderService {
    private InMemoryDatabase db = InMemoryDatabase.getInstance();

      public String placeOrder(String userId, String restaurantId, String itemName, int qty, PaymentStrategy paymentStrategy) {
        List<Item> catalog = db.getCatalogs().getOrDefault(restaurantId, new ArrayList<>());
        for (Item i : catalog) {
            if (i.getName().equalsIgnoreCase(itemName) && i.getQuantity() >= qty) {
                double totalAmount = qty * i.getPrice();

                // Deduct stock
                i.setQuantity(i.getQuantity() - qty);

                // Create order
                List<OrderItem> orderItems = Arrays.asList(new OrderItem(itemName, qty, i.getPrice()));
                Order order = OrderFactory.createOrder(userId, restaurantId, orderItems);
                db.getUserOrders().computeIfAbsent(userId, k -> new ArrayList<>()).add(order);

                // Process payment
                PaymentContext paymentContext = new PaymentContext(paymentStrategy);
                paymentContext.executePayment(totalAmount);

                System.out.println("Order placed! ID: " + order.getOrderId());
                return order.getOrderId();
            }
        }
        System.out.println("Order failed: Item unavailable or insufficient quantity.");
        return null;
    }


    public List<Order> getOrders(String userId) {
        return db.getUserOrders().getOrDefault(userId, new ArrayList<>());
    }

    public void cancelOrder(String orderId) {
        for (List<Order> orders : db.getUserOrders().values()) {
            for (Order o : orders) {
                if (o.getOrderId().equals(orderId) && o.getStatus() == OrderStatus.CONFIRMED) {
                    o.setStatus(OrderStatus.CANCELLED);
                    System.out.println("Order cancelled: " + orderId);
                    return;
                }
            }
        }
        System.out.println("Cancel failed: Order not found or already cancelled.");
    }
}
