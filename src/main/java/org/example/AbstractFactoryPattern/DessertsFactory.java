package org.example.AbstractFactoryPattern;

public class DessertsFactory implements AbstractMenuFactory {
    public Dessert createDessert(String name) {
        return new Cake(name);
    }

    public Appetizer createAppetizer(String name) {
        return null; // DessertsFactory doesn't create appetizers
    }

    public MainCourse createMainCourse(String name) {
        return null; // DessertsFactory doesn't create main courses
    }
}