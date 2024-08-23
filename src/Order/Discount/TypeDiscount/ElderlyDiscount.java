package Order.Discount.TypeDiscount;

import Order.Discount.iDiscount;

public class ElderlyDiscount implements iDiscount {
    public double getDiscount() {
        return 0.6;
    }
}
