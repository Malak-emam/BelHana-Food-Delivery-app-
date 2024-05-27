package org.example.AbstractFactoryPattern;


public class Cookies implements Dessert {
    private String name;

    public Cookies(String name) {
        this.name = name;
    }

    public String getDessertName() {
        return name;
    }

    public void display() {
        System.out.println("Cookies: " + name);
    }
}
