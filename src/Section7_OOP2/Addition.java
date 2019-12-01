package Section7_OOP2;

public class Addition {
    private String name;
    private double price;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
