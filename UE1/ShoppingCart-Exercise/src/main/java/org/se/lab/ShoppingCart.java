package org.se.lab;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private int taxrate;
    private List<Product> products = new ArrayList<>();
    private long result;
    private long tax;

    public ShoppingCart() {

    }

    public int getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(int taxrate) {
        this.taxrate = taxrate;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public long calculateTotalSum() {
        for (Product product : products) {
            long price = product.getPrice();
            result = result + price;
        } return result;
    }

    public long calculateTax() {
        long sum = calculateTotalSum();
        if (getTaxrate() != 0) {
            tax = (sum * getTaxrate()) / 100;
        } else {
            tax = (sum * 20) / 100;
        }
        return tax;
    }
}
