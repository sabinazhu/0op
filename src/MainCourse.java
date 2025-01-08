public class MainCourse extends MenuItem {
    public MainCourse(String name, double price) {
        super(name, price, "Main Course");
    }

    @Override
    public String toString() {
        return "Main Course: " + getName() + ", Price: " + getPrice();
    }
}
