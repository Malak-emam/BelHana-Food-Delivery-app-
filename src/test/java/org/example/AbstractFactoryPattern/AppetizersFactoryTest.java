package org.example.AbstractFactoryPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppetizersFactoryTest {

    @Test
    public void testCreateAppetizer() {
        AbstractMenuFactory factory = new AppetizersFactory();
        Appetizer appetizer = factory.createAppetizer("Caesar Salad");

        assertNotNull(appetizer, "Appetizer should not be null");
        assertEquals("Caesar Salad", appetizer.getAppetizerName(), "Appetizer name should be 'Caesar Salad'");
        assertTrue(appetizer instanceof Salad, "Appetizer should be an instance of Salad");
    }

    @Test
    public void testCreateDessert() {
        AbstractMenuFactory factory = new AppetizersFactory();
        Dessert dessert = factory.createDessert("Chocolate Cake");

        assertNull(dessert, "Dessert should be null for AppetizersFactory");
    }

    @Test
    public void testCreateMainCourse() {
        AbstractMenuFactory factory = new AppetizersFactory();
        MainCourse mainCourse = factory.createMainCourse("Steak");

        assertNull(mainCourse, "Main Course should be null for AppetizersFactory");
    }
}
