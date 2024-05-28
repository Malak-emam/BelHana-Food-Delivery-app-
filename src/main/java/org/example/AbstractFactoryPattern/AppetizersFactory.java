package org.example.AbstractFactoryPattern;

public class AppetizersFactory extends AbstractMenuFactory {
    public Dessert createDessert(String name) {
        return null; // AppetizersFactory doesn't create desserts
    }

    public Appetizer createAppetizer(String name) {
        return new Salad(name);
    }

    public MainCourse createMainCourse(String name) {
        return null; // AppetizersFactory doesn't create main courses
    }
}
