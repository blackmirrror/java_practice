package prac16;

public final class Dish implements Item{
    private final int price;
    private final String name;
    private final String description;

    public Dish(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        price = 0;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Name of dish: " + name
                + ", price: " + price
                + ", description: " + description;
    }
}
