package org.se.lab;

import java.util.Objects;

public class Product extends Entity{

    private String description;
    private long price;

    public Product(long id, String description, long price) {
        setId(id);
        setDescription(description);
        setPrice(price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        } else throw new IllegalArgumentException("description can't be null");
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if (price >= 0) {
            this.price = price;
        } else throw new IllegalArgumentException("price must be positive");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
