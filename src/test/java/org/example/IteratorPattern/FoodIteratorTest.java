package org.example.IteratorPattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodIteratorTest {

    private List<FoodItem> foodItems;
    private FoodIterator foodIterator;

    @BeforeEach
    void setUp() {
        foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Pizza"));
        foodItems.add(new FoodItem("Burger"));
        foodItems.add(new FoodItem("Salad"));
        foodIterator = new FoodIterator(foodItems);
    }

    @Test
    void testHasNext() {
        assertTrue(foodIterator.hasNext());
        for (int i = 0; i < foodItems.size(); i++) {
            foodIterator.next();
        }
        assertFalse(foodIterator.hasNext());
    }

    @Test
    void testNext() {
        assertEquals("Pizza", foodIterator.next().getName());
        assertEquals("Burger", foodIterator.next().getName());
        assertEquals("Salad", foodIterator.next().getName());
        assertNull(foodIterator.next());
    }
}
