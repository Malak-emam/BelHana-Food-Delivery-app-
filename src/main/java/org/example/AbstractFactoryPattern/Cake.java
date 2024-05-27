package org.example.AbstractFactoryPattern;

// Cake class implementing Dessert
public class Cake implements Dessert {
    private String CAname;

    public Cake(String name) {
        this.CAname = name;
    }

    public String getDessertName() {
        return CAname;
    }

    public void display() {
        System.out.println("Cake: " + CAname);
    }
}
