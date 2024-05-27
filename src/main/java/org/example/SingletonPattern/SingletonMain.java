package org.example.SingletonPattern;

public class SingletonMain {
    public static void main(String[] args) {
        // Get the single instance of DatabaseAdmin
        DatabaseAdmin admin1 = DatabaseAdmin.getInstance();
        DatabaseAdmin admin2 = DatabaseAdmin.getInstance();

        // Verify that both references point to the same instance
        System.out.println("admin1 and admin2 are the same instance: " + (admin1 == admin2));

        // Use the singleton instance to perform some operations
        admin1.connect();
    }
}

