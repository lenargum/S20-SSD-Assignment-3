package project11;

import java.util.List;

class WebsiteDatabase {
    DatabaseConnection databaseConnection;

    WebsiteDatabase() {
        databaseConnection = new DatabaseConnection("host", 5432, "postgres", "user");
    }

    public void storeWebsite(Website website) {

    }

    public void removeWebsite(Website website) {

    }

    public Website getWebsite(Website website){
        return null;
    }

    public void updateWebsite(Website website) {

    }

    public List<Website> getAllWebsites(Website website){
        return null;
    }
}
