package project11;

import java.util.List;

class WebsiteDatabaseSingleton {
    private static WebsiteDatabaseSingleton obj;

    private static final String databaseIP = "192.168.0.1";
    private static final String databasePort = "1337";
    private static final String dbDriverName = "jdbc";
    private static final String dbClientUsername = "admin";
    private static final String dbClientPassword = "admin";


    private WebsiteDatabaseSingleton() {
    }

    public static WebsiteDatabaseSingleton getInstance() {
        if (obj == null) {
            obj = new WebsiteDatabaseSingleton();
        }
        return obj;
    }

    private void executeCommand(String command) {
        // Database connector and command executor
    }

    private List<Website> executeQuery(String command){
        // Database connector and query executor
        return null;
    }

    public void storeWebsite(Website website) {
        this.executeCommand(String.format("%s://%s:%s@%s:%s/insert?%s",
                dbDriverName, databaseIP, databasePort, dbClientUsername, dbClientPassword, website.serialize()));
    }

    public void removeWebsite(Website website) {
        this.executeCommand(String.format("%s://%s:%s@%s:%s/delete?%s",
                dbDriverName, databaseIP, databasePort, dbClientUsername, dbClientPassword, website.serialize()));
    }

    public Website getWebsite(String website) {
        return this.executeQuery(String.format("%s://%s:%s@%s:%s/get?%s",
                dbDriverName, databaseIP, databasePort, dbClientUsername, dbClientPassword, website)).get(0);
    }

    public void updateWebsite(Website website) {
        this.executeCommand(String.format("%s://%s:%s@%s:%s/update?%s",
                dbDriverName, databaseIP, databasePort, dbClientUsername, dbClientPassword, website.serialize()));
    }

    public List<Website> getAllWebsites() {
        return this.executeQuery(String.format("%s://%s:%s@%s:%s/get",
                dbDriverName, databaseIP, databasePort, dbClientUsername, dbClientPassword));
    }
}
