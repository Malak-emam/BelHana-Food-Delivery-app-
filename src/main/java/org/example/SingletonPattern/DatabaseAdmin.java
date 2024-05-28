package org.example.SingletonPattern;

public class DatabaseAdmin {
    // Static variable to hold the single instance of DatabaseAdmin
    private static DatabaseAdmin instance;

    // Private constructor to prevent instantiation
    private DatabaseAdmin() {
        // TODO: Any initialization code here
    }

    // Public method to provide access to the instance
    public static DatabaseAdmin getInstance() {
        if (instance == null) {
            synchronized (DatabaseAdmin.class) {
                if (instance == null) { // Double-check locking
                    instance = new DatabaseAdmin();
                }
            }
        }
        return instance;
    }

    // Example method for the singleton instance
    public void connect() {
        System.out.println("Connecting to the database...");
        // TODO: Database connection logic
    }
}
