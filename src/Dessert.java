public class Dessert extends MenuItem {
    public Dessert(String name, double price) {
        super(name, price, "Dessert");
    }

    @Override
    public void displayItem() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Dessert: " + getName() + ", Price: " + getPrice();
    }
}

