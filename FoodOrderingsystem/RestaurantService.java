import java.util.*;

class RestaurantService {
    private InMemoryDatabase db = InMemoryDatabase.getInstance();

    public String registerRestaurant(String name, String gst, String email, String phone) {
        Restaurant r = RestaurantFactory.createRestaurant(name, gst, email, phone);
        db.getRestaurants().put(r.getRestaurantId(), r);
        db.getCatalogs().put(r.getRestaurantId(), new ArrayList<>());
        System.out.println("Restaurant Registered! ID: " + r.getRestaurantId());
        return r.getRestaurantId();
    }

    public void addItem(String restaurantId, String name, double price, int qty) {
        db.getCatalogs().get(restaurantId).add(new Item(name, price, qty));
        System.out.println("Item added: " + name);
    }
}
