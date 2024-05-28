package org.example.BridgePattern;

import java.util.List;
import java.util.stream.Collectors;

public class DietaryRestrictionSearch extends SearchMealAPI {
    private String restriction;

    public DietaryRestrictionSearch(String restriction) {
        this.restriction = restriction;
    }

    @Override
    public List<Meal> filterMeals(List<Meal> meals) {
        // TODO: Implement actual filtering logic based on dietary restriction
        return meals.stream()
                .filter(meal -> meal.getDietaryRestriction().equalsIgnoreCase(restriction))
                .collect(Collectors.toList());
    }
}
