package org.example.BridgePattern;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CategorySearchTest {

    @Test
    void testFilterMeals() {
        List<Meal> meals = Arrays.asList(
                new Meal(1, "Pasta", "Italian", "None"),
                new Meal(2, "Sushi", "Japanese", "None"),
                new Meal(3, "Pizza", "Italian", "Vegetarian")
        );

        CategorySearch categorySearch = new CategorySearch("Italian");
        List<Meal> filteredMeals = categorySearch.filterMeals(meals);

        assertEquals(2, filteredMeals.size());
        assertTrue(filteredMeals.stream().allMatch(meal -> "Italian".equals(meal.getCategory())));
    }
}
