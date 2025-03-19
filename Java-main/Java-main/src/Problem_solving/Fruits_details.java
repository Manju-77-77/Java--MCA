package Problem_solving;

public class Fruits_details {

    void fruit(String name) {
        System.out.println("Fruit name: " + name);
    }

    void fruit(String name, String color) {
        System.out.println("Fruit name: " + name + ", Color: " + color);
    }

    void fruit(String name, String color, double price) {
        System.out.println("Fruit name: " + name + ", Color: " + color + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Fruits_details shop = new Fruits_details();

        shop.fruit("Apple");
        shop.fruit("Banana", "Yellow");
        shop.fruit("Mango", "Orange", 1.99);
    }
}