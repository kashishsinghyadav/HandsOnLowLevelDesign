class RestaurantFactory {
    public static Restaurant createRestaurant(String name, String gstNumber, String email, String phone) {
        return new Restaurant(IdFactory.generateId(), name, gstNumber, email, phone);
    }
}
