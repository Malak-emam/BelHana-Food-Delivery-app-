package org.example.AbstractFactoryPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AbstractMenuFactoryTest {

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
        AbstractMenuFactory factory = new AppetizersFactory();
        Appetizer appetizer = factory.createAppetizer("Caesar Salad");

        assertNotNull(appetizer, "Appetizer should not be null");
        assertEquals("Caesar Salad", appetizer.getAppetizerName(), "Appetizer name should be 'Caesar Salad'");
        assertTrue(appetizer instanceof Salad, "Appetizer should be an instance of Salad");
    }

    @Test
    public void testCreateMainCourse() {
        AbstractMenuFactory factory = new MainCourseFactory();
        MainCourse mainCourse = factory.createMainCourse("Veggie Platter");

        assertNotNull(mainCourse, "Main Course should not be null");
        assertEquals("Veggie Platter", mainCourse.getMainCourseName(), "Main Course name should be 'Veggie Platter'");
        assertTrue(mainCourse instanceof Veggies, "Main Course should be an instance of Veggies");
    }
}