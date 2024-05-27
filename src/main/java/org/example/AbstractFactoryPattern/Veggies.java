package org.example.AbstractFactoryPattern;

public class Veggies implements MainCourse {
    private String name;

    public Veggies(String name) {
        this.name = name;
    }

    public String getMainCourseName() {
        return name;
    }

    public void display() {
        System.out.println("org.example.AbstractFactoryPattern.Veggies: " + name);
    }
}
