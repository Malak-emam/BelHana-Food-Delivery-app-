// Soup class implementing Appetizer
public class Soup implements Appetizer {
    private String name;

    public Soup(String name) {
        this.name = name;
    }

    public String getAppetizerName() {
        return name;
    }

    public void display() {
        System.out.println("Soup: " + name);
    }
}