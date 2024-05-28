package org.example.SingletonPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class DatabaseAdminTest {

    @Test
    void testGetInstance() {
        // Arrange & Act
        DatabaseAdmin instance1 = DatabaseAdmin.getInstance();
        DatabaseAdmin instance2 = DatabaseAdmin.getInstance();

        // Assert
        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    void testConnect() {
        // Arrange
        DatabaseAdmin instance = DatabaseAdmin.getInstance();

        // Act
        instance.connect();

        // Assert
        // No need to assert console output, but we can verify that the method runs without errors
    }
}
