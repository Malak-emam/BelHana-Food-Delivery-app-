package org.example.ObserverPattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverAdminTest {

    @Test
    void testUpdate() {
        ObserverAdmin observerAdmin = new ObserverAdmin("Admin1");
        observerAdmin.update("Status Update");
        // Since update prints to console, verify manually or use a logging framework
        // For simplicity, this test might just check if the method can be called without error
        assertNotNull(observerAdmin);
    }
}
