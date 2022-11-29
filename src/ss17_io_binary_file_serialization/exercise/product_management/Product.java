package ss17_io_binary_file_serialization.exercise.product_management;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacture;
    private double price;
    private String otherDescription;

    public Product() {
    }

    public Product(int id, String name, String manufacture, double price, String otherDescription) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", otherDescription='" + otherDescription + '\'' +
                '}';
    }
}
