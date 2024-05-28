package org.example.ObserverPattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderStatusManagerTest {

    private OrderStatusManager statusManager;
    private ObserverAdmin observerAdmin;
    private ObserverOrder observerOrder;

    @BeforeEach
    void setUp() {
        statusManager = new OrderStatusManager();
        observerAdmin = new ObserverAdmin("Admin1");
        observerOrder = new ObserverOrder(123);
    }

    @Test
    void testAddObserver() {
        statusManager.addObserver(observerAdmin);
        assertEquals(1, statusManager.getObservers().size());
        statusManager.addObserver(observerOrder);
        assertEquals(2, statusManager.getObservers().size());
    }

    @Test
    void testRemoveObserver() {
        statusManager.addObserver(observerAdmin);
        statusManager.removeObserver(observerAdmin);
        assertEquals(0, statusManager.getObservers().size());
    }

    @Test
    void testNotifyObservers() {
        TestObserver testObserver = new TestObserver();
        statusManager.addObserver(testObserver);

        statusManager.setStatus("New Status");

        assertEquals("New Status", testObserver.getLastStatus());
    }

    // Custom observer for testing notification
    class TestObserver implements Observer {
        private String lastStatus;

        @Override
        public void update(String status) {
            this.lastStatus = status;
        }

        public String getLastStatus() {
            return lastStatus;
        }
    }
}
