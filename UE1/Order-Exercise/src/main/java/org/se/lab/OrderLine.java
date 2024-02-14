package org.se.lab;

import java.util.Objects;

public class OrderLine extends Entity {

    private int quantity;
    private Product product;

    public OrderLine(long id, int quantity, Product product) {
        setId(id);
        setQuantity(quantity);
        setProduct(product);
    }

    public Product getProduct() {
        return product;
    }

    private void setProduct(Product product) {
        if (product != null) {
            this.product = product;
        } else throw new IllegalArgumentException("product can't be null");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else throw new IllegalArgumentException("quantity must be positive");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrderLine orderLine = (OrderLine) o;
        return quantity == orderLine.quantity && Objects.equals(product, orderLine.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity, product);
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}