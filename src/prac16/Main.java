package prac16;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Drink d1 = new Drink(49, "Sprite", "drink");
        Drink d2 = new Drink(59, "Fanta", "drink");
        Drink d3 = new Drink(129, "Cola", "drink");

        Dish di1 = new Dish(259, "Cheesecake", "sweet");
        Dish di2 = new Dish(409, "Sushi", "sea");

        order.add(d1);
        order.add(d2);
        order.add(d3);
        order.add(di1);
        order.add(di2);
        System.out.println(order);
        System.out.println(order.priceTotal());

        order.remove(di2);
        order.remove(d2);
        System.out.println(order);
        System.out.println(order.priceTotal());
    }
}
