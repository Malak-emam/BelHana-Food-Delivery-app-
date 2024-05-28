package org.example.FlyweightPattern;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MenuManagerTest {

    @Test
    void testMenuManager() {
        // Arrange
        MenuManager menuManager = new MenuManager();
        Image image = new ImageIcon("path_to_image").getImage(); // Provide actual path to image
        String name = "Burger";
        String description = "Delicious burger";
        double price = 10.99;

        // Act
        menuManager.addMenuItem(name, description, image, price);
        List<MenuItem> menuItems = menuManager.getMenuItems();

        // Assert
        assertNotNull(menuItems);
        assertEquals(1, menuItems.size());
        MenuItem menuItem = menuItems.get(0);
        assertNotNull(menuItem);
        assertEquals(name, menuItem.getMenuItemType().getName());
        assertEquals(description, menuItem.getMenuItemType().getDescription());
        assertEquals(price, menuItem.getPrice());
    }
}
