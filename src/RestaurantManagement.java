import java.util.List;

public class RestaurantManagement {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Gourmet Paradise");

        restaurant.addMenuItem(new FastFood("Burger", 5.99));
        restaurant.addMenuItem(new MainCourse("Pasta", 8.99));
        restaurant.addMenuItem(new Dessert("Ice Cream", 3.49));

        Order order1 = new Order(1);
        order1.addItem(new FastFood("Burger", 5.99));
        order1.addItem(new Dessert("Ice Cream", 3.49));

        restaurant.createOrder(order1);

        System.out.println("Dessert:");
        restaurant.displayFilteredItems("Dessert");

        System.out.println("Menus sorted by price:");
        restaurant.displaySortedMenu();

        System.out.println("Orders in the restaurant:");
        restaurant.displayOrders();
    }
}

