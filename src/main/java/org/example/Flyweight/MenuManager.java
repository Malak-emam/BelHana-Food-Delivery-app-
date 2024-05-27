package org.example.Flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private List<MenuItem> menuItems = new ArrayList<>();
    private MenuItemFactory menuItemFactory = new MenuItemFactory();

    public void addMenuItem(String name, String description, Image image, double price) {
        MenuItemType menuItemType = menuItemFactory.getMenuItemType(name, description, image);
        MenuItem menuItem = new MenuItem(menuItemType, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
