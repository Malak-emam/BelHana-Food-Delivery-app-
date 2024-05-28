package org.example.BridgePattern;

import java.util.List;
import java.util.stream.Collectors;

public class CategorySearch extends SearchMealAPI {
    private String category;

    public CategorySearch(String category) {
        this.category = category;
    }

    @Override
    public List<Meal> filterMeals(List<Meal> meals) {
        // TODO: Implement actual filtering logic based on category
        return meals.stream()
                .filter(meal -> meal.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}
