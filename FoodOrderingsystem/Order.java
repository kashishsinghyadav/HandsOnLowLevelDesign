import java.util.*;


class Order {
    private String orderId;
    private String userId;
    private String restaurantId;
    private List<OrderItem> items;
    private OrderStatus status;

    public Order(String orderId, String userId, String restaurantId, List<OrderItem> items) {
        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.items = items;
        this.status = OrderStatus.CONFIRMED;
    }

    public String getOrderId() { return orderId; }
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
}


