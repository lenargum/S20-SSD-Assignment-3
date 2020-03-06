package project11;

import java.util.List;

class WebsiteDatabaseSingleton {
    private static WebsiteDatabaseSingleton obj;

    private WebsiteDatabaseSingleton() {

    }

    public static WebsiteDatabaseSingleton getInstance() {
        if (obj == null) {
            obj = new WebsiteDatabaseSingleton();
        }
        return obj;
    }

    private String databaseHost;
    private String databasePort;
    private String driverName;
    private String databaseClient;

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
