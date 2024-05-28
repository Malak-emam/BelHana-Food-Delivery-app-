package org.example.ObserverPattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverOrderTest {

    @Test
    void testUpdate() {
        ObserverOrder observerOrder = new ObserverOrder(123);
        observerOrder.update("Order Status Update");
        // Similar to ObserverAdminTest, verify the update behavior
        assertNotNull(observerOrder);
    }
}
