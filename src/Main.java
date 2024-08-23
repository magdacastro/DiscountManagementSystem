import Order.Order;
import Order.Client;
import Order.Product;
import Order.Discount.DiscountFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Order order = new Order(1,  new Client("Joana", 16, false), new Product(15.90, "Camiseta"));
        double discount = order.applyDiscount(new DiscountFactory());

        System.out.println(discount);
    }
}