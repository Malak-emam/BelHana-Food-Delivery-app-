package org.example.BridgePattern;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void testSearchMealsWithCategory() {
        List<Meal> meals = Arrays.asList(
                new Meal(1, "Pasta", "Italian", "None"),
                new Meal(2, "Sushi", "Japanese", "None"),
                new Meal(3, "Pizza", "Italian", "Vegetarian")
        );

        Meal meal = new Meal(0, "TestMeal", "TestCategory", "TestRestriction");
        meal.setSearchMealAPI(new CategorySearch("Italian"));
        List<Meal> filteredMeals = meal.searchMeals(meals);

        assertEquals(2, filteredMeals.size());
        assertTrue(filteredMeals.stream().allMatch(m -> "Italian".equals(m.getCategory())));
    }

    @Test
    void testSearchMealsWithDietaryRestriction() {
        List<Meal> meals = Arrays.asList(
                new Meal(1, "Salad", "Vegetarian", "Vegetarian"),
                new Meal(2, "Steak", "American", "None"),
                new Meal(3, "Tofu Stir Fry", "Asian", "Vegan")
        );

        Meal meal = new Meal(0, "TestMeal", "TestCategory", "TestRestriction");
        meal.setSearchMealAPI(new DietaryRestrictionSearch("Vegan"));
        List<Meal> filteredMeals = meal.searchMeals(meals);

        assertEquals(1, filteredMeals.size());
        assertTrue(filteredMeals.stream().allMatch(m -> "Vegan".equals(m.getDietaryRestriction())));
    }

    @Test
    void testSearchMealsWithName() {
        List<Meal> meals = Arrays.asList(
                new Meal(1, "Pasta", "Italian", "None"),
                new Meal(2, "Burger", "American", "None"),
                new Meal(3, "Pizza", "Italian", "Vegetarian")
        );

        Meal meal = new Meal(0, "TestMeal", "TestCategory", "TestRestriction");
        meal.setSearchMealAPI(new NameSearch("Pizza"));
        List<Meal> filteredMeals = meal.searchMeals(meals);

        assertEquals(1, filteredMeals.size());
        assertTrue(filteredMeals.stream().allMatch(m -> "Pizza".equals(m.getName())));
    }
}
