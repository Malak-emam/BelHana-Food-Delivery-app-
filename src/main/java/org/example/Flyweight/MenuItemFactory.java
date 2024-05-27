package org.example.Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MenuItemFactory {
    private Map<String, MenuItemType> menuItemTypes = new HashMap<>();

    public MenuItemType getMenuItemType(String name, String description, Image image) {
        MenuItemType menuItemType = menuItemTypes.get(name);
        if (menuItemType == null) {
            menuItemType = new MenuItemType(name, description, image);
            menuItemTypes.put(name, menuItemType);
        }
        return menuItemType;
    }
}
