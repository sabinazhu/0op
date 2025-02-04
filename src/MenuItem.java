import java.util.Objects;

public abstract class MenuItem {
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

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public abstract void displayItem();

    @Override
    public String toString() {
        return "MenuItem: " + name + ", Price: " + price + ", Category: " + category;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MenuItem menuItem = (MenuItem) obj;
        return Double.compare(menuItem.price, price) == 0 &&
                name.equals(menuItem.name) &&
                category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }
}

