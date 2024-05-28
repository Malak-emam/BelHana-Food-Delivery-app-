package org.example.IteratorPattern;

import java.util.List;

public class FoodIterator implements Iterator {
    private List<FoodItem> items;
    private int current;

    public FoodIterator(List<FoodItem> items) {
        this.items = items;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < items.size();
    }

    @Override
    public FoodItem next() {
        if (!hasNext()) {
            return null;
        }
        return items.get(current++);
    }
}
