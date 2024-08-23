package Order.Discount.TypeDiscount;

import Order.Discount.iDiscount;

public class DisabledPersonDiscount implements iDiscount {
    public double getDiscount() {
        return 0.8;
    }
}
