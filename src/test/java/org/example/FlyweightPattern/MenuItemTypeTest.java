package org.example.FlyweightPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuItemTypeTest {

    @Test
    void testMenuItemType() {
        // Arrange
        String name = "Burger";
        String description = "Delicious burger";
        // Image is not needed for this test

        // Act
        MenuItemType menuItemType = new MenuItemType(name, description, null);

        // Assert
        assertEquals(name, menuItemType.getName());
        assertEquals(description, menuItemType.getDescription());
    }
}
