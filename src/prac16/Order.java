package prac16;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> order;

    public Order(){
        this.order = new ArrayList<Item>();
    };

    public Order(ArrayList<Item> order) {
        this.order = order;
    }

    public ArrayList<Item> getOrder() {
        return order;
    }

    public void add(Item item) {
        order.add(item);
    }

    public void remove(Item item) {
        order.remove(item);
    }

    public int priceTotal() {
        int res = 0;
        for (Item item : order) {
            res += item.getPrice();
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "Your Order:\n";
        for(Item item : order) {
            res += item.toString();
            res += "\n";
        }
        return res;
    }
}
