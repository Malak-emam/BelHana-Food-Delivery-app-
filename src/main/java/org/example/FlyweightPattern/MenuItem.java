package org.example.FlyweightPattern;

public class MenuItem {
    private double price;
    private MenuItemType menuItemType;

    public MenuItem(MenuItemType menuItemType, double price) {
        this.menuItemType = menuItemType;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public MenuItemType getMenuItemType() {
        return menuItemType;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", menuItemType=" + menuItemType +
                '}';
    }
}
