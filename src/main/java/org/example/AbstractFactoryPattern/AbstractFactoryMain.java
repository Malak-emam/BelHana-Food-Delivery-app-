package org.example.AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractMenuFactory dessertFactory = (AbstractMenuFactory) new DessertsFactory();
        Dessert dessert1 = dessertFactory.createDessert("Cookies");
        dessert1.display();

        Dessert dessert2 = dessertFactory.createDessert("Pie");
        dessert2.display();

        Dessert dessert3 = dessertFactory.createDessert("Cake");
        dessert3.display();

        AbstractMenuFactory appetizerFactory = new AppetizersFactory();
        Appetizer appetizer1 = appetizerFactory.createAppetizer("Salad");
        appetizer1.display();

        Appetizer appetizer2 = appetizerFactory.createAppetizer("Soup");
        appetizer2.display();

        Appetizer appetizer3 = appetizerFactory.createAppetizer("Fried");
        appetizer3.display();

        AbstractMenuFactory mainCourseFactory = (AbstractMenuFactory) new MainCourseFactory();
        MainCourse mainCourse1 = mainCourseFactory.createMainCourse("Poultry");
        mainCourse1.display();

        MainCourse mainCourse2 = mainCourseFactory.createMainCourse("Meat");
        mainCourse2.display();

        MainCourse mainCourse3 = mainCourseFactory.createMainCourse("Veggies");
        mainCourse3.display();
    }
}
