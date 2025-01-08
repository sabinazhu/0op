import java.util.Objects;
public class MenuItem {
    private String name;
    private double price;
    private String category;
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MenuItem menuItem = (MenuItem) obj;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 && getName().equals(menuItem.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
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
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Category: " + category;
    }
}

