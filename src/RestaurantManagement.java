import java.util.ArrayList;
class MenuItem {
    private String name;
    private double price;
    private String category;
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void displayItem() {
        System.out.println("Name: " + name + ", Price: " + price + ", Category: " + category);
    }
}
class Order {
    private int orderId;
    private ArrayList<MenuItem> menuItems;
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.menuItems = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        totalAmount += item.getPrice();
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (MenuItem item : menuItems) {
            item.displayItem();
        }
        System.out.println("Total Amount: " + totalAmount);
    }
}

class Restaurant {
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

public class RestaurantManagement {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Gourmet Paradise");

        restaurant.addMenuItem(new MenuItem("Burger", 5.99, "Fast Food"));
        restaurant.addMenuItem(new MenuItem("Pasta", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 3.49, "Dessert"));

        Order order1 = new Order(1);
        order1.addItem(new MenuItem("Burger", 5.99, "Fast Food"));
        order1.addItem(new MenuItem("Ice Cream", 3.49, "Dessert"));

        restaurant.createOrder(order1);

        System.out.println("Orders in the restaurant:");
        restaurant.displayOrders();
    }
}
