class UserService {
    private InMemoryDatabase db = InMemoryDatabase.getInstance();

    public String registerUser(String name, String email, String phone) {
        User u = UserFactory.createUser(name, email, phone);
        db.getUsers().put(u.getUserId(), u);
        System.out.println("User Registered! ID: " + u.getUserId());
        return u.getUserId();
    }
}
