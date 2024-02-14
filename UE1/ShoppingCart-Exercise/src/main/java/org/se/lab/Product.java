package org.se.lab;

import java.util.Objects;

public class Product extends Entity{

    private String title;
    private long price;
    private Category category;

    public Product(int id, String title, long price) {
        super(id);
        setTitle(title);
        setPrice(price);
    }

    public Product(String title, long price) {
        super(IntegerSequence.getNextValue());
        setTitle(title);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else throw new IllegalArgumentException("title can't be null");
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if (price >= 0) {
            this.price = price;
        } else throw new IllegalArgumentException("price can't be negative");
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toXml() {
        return String.format("<product id=\"%d\" title=\"%s\" price=\"%s\"/>", getId(), getTitle(), getPrice()/100.0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(title, product.title) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, price, category);
    }

}


