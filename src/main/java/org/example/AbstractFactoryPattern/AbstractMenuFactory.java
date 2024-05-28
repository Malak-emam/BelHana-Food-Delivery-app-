package org.example.AbstractFactoryPattern;

public abstract class AbstractMenuFactory {
        public abstract Dessert createDessert(String name);
        public abstract Appetizer createAppetizer(String name);
        public abstract MainCourse createMainCourse(String name);
}

