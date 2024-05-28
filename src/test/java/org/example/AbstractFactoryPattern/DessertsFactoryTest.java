package org.example.AbstractFactoryPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DessertsFactoryTest {

    @Test
    public void testCreateDessert() {
        AbstractMenuFactory factory = new DessertsFactory();
        Dessert dessert = factory.createDessert("Chocolate Cake");

        assertNotNull(dessert, "Dessert should not be null");
        assertEquals("Chocolate Cake", dessert.getDessertName(), "Dessert name should be 'Chocolate Cake'");
        assertTrue(dessert instanceof Cake, "Dessert should be an instance of Cake");
    }

    @Test
    public void testCreateAppetizer() {
        AbstractMenuFactory factory = new DessertsFactory();
        Appetizer appetizer = factory.createAppetizer("Bruschetta");

        assertNull(appetizer, "Appetizer should be null for DessertsFactory");
    }

    @Test
    public void testCreateMainCourse() {
        AbstractMenuFactory factory = new DessertsFactory();
        MainCourse mainCourse = factory.createMainCourse("Steak");

        assertNull(mainCourse, "Main Course should be null for DessertsFactory");
    }
}
