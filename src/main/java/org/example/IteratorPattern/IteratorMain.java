package org.example.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Pasta"));
        foodItems.add(new FoodItem("Pizza"));
        foodItems.add(new FoodItem("Salad"));

        FoodCollection foodCollection = new FoodCollection(foodItems);
        Iterator iterator = foodCollection.createIterator();

        while (iterator.hasNext()) {
            FoodItem foodItem = iterator.next();
            System.out.println("Food Item: " + foodItem.getName());
        }
    }
}



