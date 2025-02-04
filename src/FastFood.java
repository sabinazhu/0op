public class FastFood extends MenuItem {
    public FastFood(String name, double price) {
        super(name, price, "Fast Food");
    }

    @Override
    public void displayItem() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Fast Food: " + getName() + ", Price: " + getPrice();
    }
}
