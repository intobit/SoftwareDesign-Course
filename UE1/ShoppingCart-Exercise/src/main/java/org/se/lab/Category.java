package org.se.lab;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Category extends Entity {

    private String name;
    private Category parent;
    private final List<Product> products = new ArrayList<>();
    private final List<Category> categories = new ArrayList<>();

    public Category(String name) {
        super(IntegerSequence.getNextValue());
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addChild(Category category) {
        categories.add(category);
    }

    public List<Category> getChildren() {
        return categories;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }


    @Override
    public String toXml() {
        StringBuilder cat = new StringBuilder();

        cat.append("<category id=\"").append(this.getId())
                .append("\" name=\"").append(this.getName())
                .append("\">\n");
        for (Product p: products) {
            cat.append(p.toXml()).append("\n");
        }
        for (Category c: categories) {
            cat.append(c.toXml()).append("\n");
        }
        return cat.append("</category>").toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(parent, category.parent) && Objects.equals(products, category.products) && Objects.equals(categories, category.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, parent, products, categories);
    }
}
