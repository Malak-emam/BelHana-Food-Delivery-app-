package org.example.AbstractFactoryPattern;

public interface AbstractMenuFactory {
        Dessert createDessert(String name);
        Appetizer createAppetizer(String name);
        MainCourse createMainCourse(String name);
}
