package org.example.AbstractFactoryPattern;

public class AppetizersFactory implements AbstractMenuFactory {
    public Dessert createDessert(String name) {
        return null; // Appetizers don't have desserts
    }

    public Appetizer createAppetizer(String name) {
        return new Salad(name);
    }

    public MainCourse createMainCourse(String name) {
        return null; // Appetizers don't have main courses
    }
}

