package org.example.IteratorPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {

    @Test
    void testGetName() {
        FoodItem foodItem = new FoodItem("Pizza");
        assertEquals("Pizza", foodItem.getName());
    }
}
