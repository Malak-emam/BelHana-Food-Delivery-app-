package org.example.IteratorPattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodCollectionTest {

    private FoodCollection foodCollection;
    private List<FoodItem> foodItems;

    @BeforeEach
    void setUp() {
        foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Pizza"));
        foodItems.add(new FoodItem("Burger"));
        foodItems.add(new FoodItem("Salad"));
        foodCollection = new FoodCollection(foodItems);
    }

    @Test
    void testCreateIterator() {
        Iterator iterator = foodCollection.createIterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals("Pizza", iterator.next().getName());
        assertEquals("Burger", iterator.next().getName());
        assertEquals("Salad", iterator.next().getName());
        assertFalse(iterator.hasNext());
    }
}
