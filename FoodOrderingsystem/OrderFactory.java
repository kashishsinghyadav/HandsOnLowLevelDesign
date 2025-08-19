
import java.util.*;

class OrderFactory {
    public static Order createOrder(String userId, String restaurantId, List<OrderItem> items) {
        return new Order(IdFactory.generateId(), userId, restaurantId, items);
    }
}
