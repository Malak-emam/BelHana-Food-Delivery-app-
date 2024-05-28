package org.example.BridgePattern;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NameSearchTest {

    @Test
    void testFilterMeals() {
        List<Meal> meals = Arrays.asList(
                new Meal(1, "Pasta", "Italian", "None"),
                new Meal(2, "Burger", "American", "None"),
                new Meal(3, "Pizza", "Italian", "Vegetarian")
        );

        NameSearch nameSearch = new NameSearch("Pizza");
        List<Meal> filteredMeals = nameSearch.filterMeals(meals);

        assertEquals(1, filteredMeals.size());
        assertTrue(filteredMeals.stream().allMatch(meal -> "Pizza".equals(meal.getName())));
    }
}
