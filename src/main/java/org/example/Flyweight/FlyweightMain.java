package org.example.Flyweight;

import java.awt.*;
import java.util.List;

public class FlyweightMain {
    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();

        // Add menu items
        menuManager.addMenuItem("Burger", "A delicious beef burger", null, 5.99);
        menuManager.addMenuItem("Burger", "A delicious beef burger", null, 5.99);
        menuManager.addMenuItem("Pizza", "A cheesy pizza", null, 7.99);
        menuManager.addMenuItem("Salad", "A fresh green salad", null, 4.99);

        // Get the list of menu items
        List<MenuItem> menuItems = menuManager.getMenuItems();
        menuItems.forEach(System.out::println);

        // Verify that the same MenuItemType instances are reused
        MenuItem burger1 = menuItems.get(0);
        MenuItem burger2 = menuItems.get(1);
        System.out.println("burger1 and burger2 have the same MenuItemType instance: " +
                (burger1.getMenuItemType() == burger2.getMenuItemType()));
    }
}
