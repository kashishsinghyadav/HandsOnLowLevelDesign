 import java.util.*;
class CatalogService {
    private InMemoryDatabase db = InMemoryDatabase.getInstance();

    public List<Item> searchItem(String restaurantId, String itemName) {
        List<Item> items = db.getCatalogs().getOrDefault(restaurantId, new ArrayList<>());// if not item return []list(so on null pointer exception)
        List<Item> results = new ArrayList<>();
        for (Item i : items) {
            if (i.getName().equalsIgnoreCase(itemName)) {
                results.add(i);
            }
        }
        results.sort(Comparator.comparingDouble(Item::getPrice));
        return results;
    }
}
