package org.example.FlyweightPattern;

import java.awt.*;

public class MenuItemType {
    private String name;
    private String description;
    private Image image;

    public MenuItemType(String name, String description, Image image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Image getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "MenuItemType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
