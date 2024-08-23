package Order;

public class Product {
    private String name;
    private double price;
    //NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
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

    public void setPrice(int price) {
        this.price = price;
    }
}
