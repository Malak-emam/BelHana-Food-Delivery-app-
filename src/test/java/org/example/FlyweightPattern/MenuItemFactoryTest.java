package org.example.FlyweightPattern;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MenuItemFactoryTest {

    @Test
    void testMenuItemFactory() {
        // Arrange
        MenuItemFactory menuItemFactory = new MenuItemFactory();
        Image image = new ImageIcon("path_to_image").getImage(); // Provide actual path to image
        String name = "Burger";
        String description = "Delicious burger";

        // Act
        MenuItemType menuItemType1 = menuItemFactory.getMenuItemType(name, description, image);
        MenuItemType menuItemType2 = menuItemFactory.getMenuItemType(name, description, image);

        // Assert
        assertNotNull(menuItemType1);
        assertNotNull(menuItemType2);
        assertEquals(menuItemType1, menuItemType2);
    }
}
