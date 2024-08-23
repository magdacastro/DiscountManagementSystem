package Order.Discount;

import Order.Client;
import Order.Discount.TypeDiscount.DisabledPersonDiscount;
import Order.Discount.TypeDiscount.ElderlyDiscount;
import Order.Discount.TypeDiscount.RegularDiscount;
import Order.Discount.TypeDiscount.StudentDiscount;

public class DiscountFactory {
    public iDiscount applyDiscount(Client client) {
        return switch (client.getTypeClient()) {
            case "Pessoa com deficiência" -> new DisabledPersonDiscount();
            case "Idoso" -> new ElderlyDiscount();
            case "Estudante" -> new StudentDiscount();
            case "Regular" -> new RegularDiscount();
            default -> new RegularDiscount();
        };

    }
}
