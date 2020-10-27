package quantities;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String supplier;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String supplier, double price) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", supplier='" + supplier + '\'' +
                ", price=" + price +
                '}';
    }
}
