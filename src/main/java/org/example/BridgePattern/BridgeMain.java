package org.example.BridgePattern;

import java.util.ArrayList;
import java.util.List;

public class BridgeMain {
    public static void main(String[] args) {
        // Create a list of meals
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal(1, "Vegan Salad", "Salad", "Vegan"));
        meals.add(new Meal(2, "Vegetarian Pizza", "Pizza", "Vegetarian"));
        meals.add(new Meal(3, "Chicken Burger", "Burger", "Non-Vegetarian"));
        meals.add(new Meal(4, "Vegan Burger", "Burger", "Vegan"));

        // Create a Meal object and set its search strategy to CategorySearch
        Meal meal = new Meal(0, "", "", "");
        meal.setSearchMealAPI(new CategorySearch("Burger"));

        // Search meals by category
        List<Meal> categoryFilteredMeals = meal.searchMeals(meals);
        System.out.println("Meals filtered by category 'Burger':");
        categoryFilteredMeals.forEach(System.out::println);

        // Change the search strategy to DietaryRestrictionSearch
        meal.setSearchMealAPI(new DietaryRestrictionSearch("Vegan"));

        // Search meals by dietary restriction
        List<Meal> dietaryFilteredMeals = meal.searchMeals(meals);
        System.out.println("Meals filtered by dietary restriction 'Vegan':");
        dietaryFilteredMeals.forEach(System.out::println);

        // Change the search strategy to NameSearch
        meal.setSearchMealAPI(new NameSearch("Vegetarian Pizza"));

        // Search meals by name
        List<Meal> nameFilteredMeals = meal.searchMeals(meals);
        System.out.println("Meals filtered by name 'Vegetarian Pizza':");
        nameFilteredMeals.forEach(System.out::println);
    }
}
