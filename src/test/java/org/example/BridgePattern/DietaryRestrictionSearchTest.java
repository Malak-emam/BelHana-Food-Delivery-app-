package org.example.BridgePattern;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DietaryRestrictionSearchTest {

    @Test
    void testFilterMeals() {
        List<Meal> meals = Arrays.asList(
                new Meal(1, "Salad", "Vegetarian", "Vegetarian"),
                new Meal(2, "Steak", "American", "None"),
                new Meal(3, "Tofu Stir Fry", "Asian", "Vegan")
        );

        DietaryRestrictionSearch dietaryRestrictionSearch = new DietaryRestrictionSearch("Vegetarian");
        List<Meal> filteredMeals = dietaryRestrictionSearch.filterMeals(meals);

        assertEquals(1, filteredMeals.size());
        assertTrue(filteredMeals.stream().allMatch(meal -> "Vegetarian".equals(meal.getDietaryRestriction())));
    }
}
