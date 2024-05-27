package org.example.AbstractFactoryPattern;

public class Cake implements Dessert {
    private String name;

    public Cake(String name) {
        this.name = name;
    }

    public String getDessertName() {
        return name;
    }

    public void display() {
        System.out.println("Dessert: " + name);
    }
}