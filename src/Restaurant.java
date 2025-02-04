import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public MenuItem findMenuItem(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public List<MenuItem> filterByCategory(String category) {
        return menu.stream()
                .filter(item -> item.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<MenuItem> sortByPrice() {
        return menu.stream()
                .sorted(Comparator.comparingDouble(MenuItem::getPrice))
                .collect(Collectors.toList());
    }

    public void displayFilteredItems(String category) {
        List<MenuItem> filteredItems = filterByCategory(category);
        filteredItems.forEach(System.out::println);
    }

    public void displaySortedMenu() {
        List<MenuItem> sortedMenu = sortByPrice();
        sortedMenu.forEach(System.out::println);
    }
}
