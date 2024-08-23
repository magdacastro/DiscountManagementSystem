package Order;

import Order.Discount.DiscountFactory;
import Order.Discount.iDiscount;

public class Order {
    private int idOrder;
    private Client client;
    private Product product;

    public Order(int idOrder, Client client, Product product) {
        this.idOrder = idOrder;
        this.client = client;
        this.product = product;
    }

    public double applyDiscount(DiscountFactory discount) {
        iDiscount discountInstance = discount.applyDiscount(this.client);
        double discountValue = discountInstance.getDiscount();
        return product.getPrice() * discountValue;
    }
}
