package org.example.AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractMenuFactory dessertFactory = new DessertsFactory();
        Dessert cake = dessertFactory.createDessert("Cheesecake");
        if (cake != null) cake.display();

        AbstractMenuFactory appetizerFactory = new AppetizersFactory();
        Appetizer salad = appetizerFactory.createAppetizer("Caesar Salad");
        if (salad != null) salad.display();

        AbstractMenuFactory mainCourseFactory = new MainCourseFactory();
        MainCourse veggies = mainCourseFactory.createMainCourse("Grilled Veggies");
        if (veggies != null) veggies.display();
    }
}
