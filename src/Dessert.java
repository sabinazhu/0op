public class Dessert extends MenuItem {
    public Dessert(String name, double price) {
        super(name, price, "Dessert");
    }

    @Override
    public String toString() {
        return "Dessert: " + getName() + ", Price: " + getPrice();
    }
}
