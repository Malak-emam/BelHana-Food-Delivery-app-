package org.example;

import java.util.List;

public class Menu {

    /**
     * Default constructor
     */
    public Menu() {
    }

    /**
     *
     */
    private int menuID;

    /**
     *
     */
    public String Name;

    /**
     *
     */
    public List<Item> Items;

    /**
     *
     */
    public Category categoryID;

    /**
     * @param FoodItem itemID
     * @param menuID
     */
    public void AddItem(FoodItem itemID, int menuID) {
        // TODO implement here
    }

    /**
     * @param menuID
     */
    public void UpdateMenu(int menuID) {
        // TODO implement here
    }

    /**
     * @param string itemId
     */
    public void RemoveItem(int itemId) {
        // TODO implement here
    }

}
