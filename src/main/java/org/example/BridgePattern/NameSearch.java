package org.example.BridgePattern;

import java.util.List;
import java.util.stream.Collectors;

public class NameSearch extends SearchMealAPI {
    private String name;

    public NameSearch(String name) {
        this.name = name;
    }

    @Override
    public List<Meal> filterMeals(List<Meal> meals) {
        // TODO: Implement actual filtering logic based on name
        return meals.stream()
                .filter(meal -> meal.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}
