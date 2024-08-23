package Order.Discount.TypeDiscount;

import Order.Discount.iDiscount;

public class StudentDiscount implements iDiscount {
    public double getDiscount() {
        return 0.4;
    }
}
