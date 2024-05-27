package org.example.AbstractFactoryPattern;

public class MainCourseFactory implements AbstractMenuFactory {
    public Dessert createDessert(String name) {
        return null; // MainCourseFactory doesn't create desserts
    }

    public Appetizer createAppetizer(String name) {
        return null; // MainCourseFactory doesn't create appetizers
    }

    public MainCourse createMainCourse(String name) {
        return new Veggies(name);
    }
}
