package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        // Order o = new Order(id, email, discount);
        // if (lines != null) for (OrderLine l : lines) o.addLine(l);
        // o.setExpedited(expedited);
        // o.setNotes(notes);
        Order o = new Order.Builder().setId(id).setCustomerEmail(email).setDiscountPercent(discount).addAllOrderLine(lines).setExpedited(expedited).setNotes(notes).build();

        return o;
    }
}
