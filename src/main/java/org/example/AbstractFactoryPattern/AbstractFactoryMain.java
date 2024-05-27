package org.example.AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractMenuFactory dessertFactory = new DessertsFactory();
        Dessert dessert1 = dessertFactory.createDessert();
        dessert1.display("Chocolate Chip Cookies");

        Dessert dessert2 = dessertFactory.createDessert();
        dessert2.display("Red Velvet Cake");

        Dessert dessert3 = dessertFactory.createDessert();
        dessert3.display("Apple Pie");

        AbstractMenuFactory appetizerFactory = new AppetizersFactory();
        Appetizer appetizer1 = appetizerFactory.createAppetizer();
        appetizer1.display("Caesar Salad");

        Appetizer appetizer2 = appetizerFactory.createAppetizer();
        appetizer2.display("Tomato Soup");

        Appetizer appetizer3 = appetizerFactory.createAppetizer();
        appetizer3.display("Fried Chicken");

        AbstractMenuFactory mainCourseFactory = new MainCourseFactory();
        MainCourse mainCourse1 = mainCourseFactory.createMainCourse();
        mainCourse1.display("Grilled Chicken");

        MainCourse mainCourse2 = mainCourseFactory.createMainCourse();
        mainCourse2.display("Beef Steak");

        MainCourse mainCourse3 = mainCourseFactory.createMainCourse();
        mainCourse3.display("Roasted Veggies");
    }
}
