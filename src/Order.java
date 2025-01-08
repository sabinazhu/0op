import java.util.ArrayList;
public class Order {
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
    public double getTotalAmount() {
        return totalAmount;
    }
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (MenuItem item : menuItems) {
            item.displayItem();
        }
        System.out.println("Total Amount: " + totalAmount);
    }
}