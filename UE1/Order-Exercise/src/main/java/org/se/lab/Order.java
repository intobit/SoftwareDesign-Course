package org.se.lab;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Order extends Entity {

    private String name;
    private final List<OrderLine> orderLines = new ArrayList<>();

    public Order(long id, String name) {
        setId(id);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else throw new IllegalArgumentException("name can't be null");
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return Objects.equals(name, order.name) && Objects.equals(orderLines, order.orderLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, orderLines);
    }
}
