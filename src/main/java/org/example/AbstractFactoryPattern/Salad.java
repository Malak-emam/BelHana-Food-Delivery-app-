package org.example.AbstractFactoryPattern;

public class Salad implements Appetizer {
    private String name;

    public Salad(String name) {
        this.name = name;
    }

    public String getAppetizerName() {
        return name;
    }

    public void display() {
        System.out.println("org.example.AbstractFactoryPattern.Salad: " + name);
    }
}
