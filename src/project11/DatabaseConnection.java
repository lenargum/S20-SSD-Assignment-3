package project11;

public class DatabaseConnection {
    private String databaseHost;
    private Integer databasePort;
    private String driverName;
    private String databaseClient;

    DatabaseConnection(String databaseHost, Integer databasePort, String driverName, String databaseClient) {
        this.databaseHost = databaseHost;
        this.databasePort = databasePort;
        this.driverName = driverName;
        this.databaseClient = databaseClient;
    }

    void connect() {
        // connection to database with given settings
    }

    void execute(String procedure) {
        // executes given procedure in database
    }

    String query(String query) {
        // queries database by given query
        return "";
    }
}
