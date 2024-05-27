package org.example.BridgePattern;

import java.util.List;

public class Meal {
    private int mealID;
    private String name;
    private String category;
    private String dietaryRestriction;
    private SearchMealAPI searchMealAPI;

    public Meal(int mealID, String name, String category, String dietaryRestriction) {
        this.mealID = mealID;
        this.name = name;
        this.category = category;
        this.dietaryRestriction = dietaryRestriction;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

    public void setSearchMealAPI(SearchMealAPI searchMealAPI) {
        this.searchMealAPI = searchMealAPI;
    }

    public List<Meal> searchMeals(List<Meal> meals) {
        return searchMealAPI.filterMeals(meals);
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealID=" + mealID +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", dietaryRestriction='" + dietaryRestriction + '\'' +
                '}';
    }
}
