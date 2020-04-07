package project11;

public class DatabaseManager {
    Database database;
    DatabaseConnection databaseConnection;

    DatabaseManager(Database database, DatabaseConnection databaseConnection) {
        this.database = database;
        this.databaseConnection = databaseConnection;
    }
}
