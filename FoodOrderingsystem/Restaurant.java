class Restaurant {
    private String restaurantId;
    private String name;
    private String gstNumber;
    private String email;
    private String phone;

    public Restaurant(String restaurantId, String name, String gstNumber, String email, String phone) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.gstNumber = gstNumber;
        this.email = email;
        this.phone = phone;
    }

    public String getRestaurantId() { 
        return restaurantId; 
    }
}
