package org.example.AbstractFactoryPattern;

// org.example.AbstractFactoryPattern.Soup class implementing Appetizer
public class Soup implements Appetizer {
    private String name;

    public Soup(String name) {
        this.name = name;
    }

    public String getAppetizerName() {
        return name;
    }

    public void display() {
        System.out.println("org.example.AbstractFactoryPattern.Soup: " + name);
    }
}