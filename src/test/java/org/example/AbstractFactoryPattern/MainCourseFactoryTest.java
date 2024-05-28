package org.example.AbstractFactoryPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainCourseFactoryTest {

    @Test
    public void testCreateMainCourse() {
        AbstractMenuFactory factory = new MainCourseFactory();
        MainCourse mainCourse = factory.createMainCourse("Veggie Platter");

        assertNotNull(mainCourse, "Main Course should not be null");
        assertEquals("Veggie Platter", mainCourse.getMainCourseName(), "Main Course name should be 'Veggie Platter'");
        assertTrue(mainCourse instanceof Veggies, "Main Course should be an instance of Veggies");
    }

    @Test
    public void testCreateDessert() {
        AbstractMenuFactory factory = new MainCourseFactory();
        Dessert dessert = factory.createDessert("Chocolate Cake");

        assertNull(dessert, "Dessert should be null for MainCourseFactory");
    }

    @Test
    public void testCreateAppetizer() {
        AbstractMenuFactory factory = new MainCourseFactory();
        Appetizer appetizer = factory.createAppetizer("Bruschetta");

        assertNull(appetizer, "Appetizer should be null for MainCourseFactory");
    }
}
