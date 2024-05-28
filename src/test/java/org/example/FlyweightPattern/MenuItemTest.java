package org.example.FlyweightPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuItemTest {

    @Test
    void testMenuItem() {
        // Arrange
        MenuItemType menuItemType = new MenuItemType("Burger", "Delicious burger", null); // Image is not needed for this test
        double price = 10.99;

        // Act
        MenuItem menuItem = new MenuItem(menuItemType, price);

        // Assert
        assertEquals(price, menuItem.getPrice());
        assertEquals(menuItemType, menuItem.getMenuItemType());
    }
}
