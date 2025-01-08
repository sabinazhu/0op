import java.util.List;
public class RestaurantManagement {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Gourmet Paradise");

        restaurant.addMenuItem(new MenuItem("Burger", 5.99, "Fast Food"));
        restaurant.addMenuItem(new MenuItem("Pasta", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 3.49, "Dessert"));

        Order order1 = new Order(1);
        order1.addItem(new MenuItem("Burger", 5.99, "Fast Food"));
        order1.addItem(new MenuItem("Ice Cream", 3.49, "Dessert"));
        System.out.println("Dessert:");
        restaurant.displayFilteredItems("Dessert");
        System.out.println("Menus sorted by price:");
        restaurant.displaySortedMenu();

        restaurant.createOrder(order1);

        System.out.println("Orders in the restaurant:");
        restaurant.displayOrders();
    }
}