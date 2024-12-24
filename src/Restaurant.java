import java.util.ArrayList;
public class Restaurant {
    private String name;
    private ArrayList<MenuItem> menu;
    private ArrayList<Order> orders;
    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
    public void createOrder(Order order) {
        orders.add(order);
    }
    public void displayOrders() {
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}
