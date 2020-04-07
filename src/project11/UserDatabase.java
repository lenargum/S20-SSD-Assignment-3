package project11;

class UserDatabase {
    DatabaseConnection databaseConnection;

    UserDatabase() {
        databaseConnection = new DatabaseConnection("host", 5432, "postgres", "user");
    }

    public User getUser(String name) {
        return new User();
    }

    public void addUser(User user) {

    }
}
