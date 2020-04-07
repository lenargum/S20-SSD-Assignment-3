package project11;

public class DatabaseManager {
    UserDatabase userDatabase;
    WebsiteDatabase websiteDatabase;

    DatabaseManager() {
        userDatabase = new UserDatabase();
        websiteDatabase = new WebsiteDatabase();
    }
}
