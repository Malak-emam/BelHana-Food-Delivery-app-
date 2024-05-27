package org.example.BridgePattern;

import java.util.List;

public abstract class SearchMealAPI {
    public abstract List<Meal> filterMeals(List<Meal> meals);
}
