 class UserFactory {
    public static User createUser(String name, String email, String phone) {
        return new User(IdFactory.generateId(), name, email, phone);
    }
}
