package org.example.IteratorPattern;

import java.util.List;

public class FoodCollection {
    private List<FoodItem> items;

    public FoodCollection(List<FoodItem> items) {
        this.items = items;
    }

    public Iterator createIterator() {
        return new FoodIterator(items);
    }
}

